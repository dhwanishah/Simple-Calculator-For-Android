package com.dmantor.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	
	String firstVal = "";
	String secondVal = "";
	int btPressCount = 0;
	String btType = "";
	
	EditText screen;
	Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,
	       btPlus, btMinus, btMulti, btDiv, 
	       btC, btDec;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        
    }
    
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt9:
			if (btPressCount == 0) {
	    		addNumberToDisplay("9", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("9", "secondVal");
	    	}
			break;
		case R.id.bt8:
			if (btPressCount == 0) {
	    		addNumberToDisplay("8", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("8", "secondVal");
	    	}
			break;
		case R.id.bt7:
			if (btPressCount == 0) {
	    		addNumberToDisplay("7", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("7", "secondVal");
	    	}
			break;
		case R.id.bt6:
			if (btPressCount == 0) {
	    		addNumberToDisplay("6", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("6", "secondVal");
	    	}
			break;
		case R.id.bt5:
			if (btPressCount == 0) {
	    		addNumberToDisplay("5", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("5", "secondVal");
	    	}
			break;
		case R.id.bt4:
			if (btPressCount == 0) {
	    		addNumberToDisplay("4", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("4", "secondVal");
	    	}
			break;
		case R.id.bt3:
			if (btPressCount == 0) {
	    		addNumberToDisplay("3", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("3", "secondVal");
	    	}
			break;
		case R.id.bt2:
			if (btPressCount == 0) {
	    		addNumberToDisplay("2", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("2", "secondVal");
	    	}
			break;
		case R.id.bt1:
			if (btPressCount == 0) {
	    		addNumberToDisplay("1", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("1", "secondVal");
	    	}
			break;
		case R.id.bt0:
			if (btPressCount == 0) {
	    		addNumberToDisplay("0", "firstVal");
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		addNumberToDisplay("0", "secondVal");
	    	}
			break;
		case R.id.btDec:
			if (btPressCount == 0) {
				if (!containsDecimal(firstVal)) {
					addNumberToDisplay(".", "firstVal");
				}
	    	} else if ((btPressCount == 1) || (btPressCount == 2) || (btPressCount == 3) || (btPressCount == 4)) {
	    		if (!containsDecimal(secondVal)) {
	    			addNumberToDisplay(".", "secondVal");
	    		}
	    	}
			break;
		case R.id.btC:
			setScreenZero();
	    	btPressCount = 0;
			break;
		case R.id.btPlus:
			if (btPressCount == 0) {
				setScreenZero();
	    		btPressCount = 1;
	    	}
			break;
		case R.id.btMinus:
			if (btPressCount == 0) {
				setScreenZero();
	    		btPressCount = 2;
	    	}
			break;
		case R.id.btMulti:
			if (btPressCount == 0) {
				setScreenZero();
	    		btPressCount = 3;
	    	}
			break;
		case R.id.btDiv:
			if (btPressCount == 0) {
				setScreenZero();
	    		btPressCount = 4;
	    	}
			break;
		case R.id.btEQ:
			float total;
	    	if (btPressCount == 1) {
	    		total = Float.parseFloat(firstVal) + Float.parseFloat(secondVal);
	    		screen.setText(Float.toString(total));
	    		btPressCount = 0;
	    	} else if (btPressCount == 2) {
	    		total = Float.parseFloat(firstVal) - Float.parseFloat(secondVal);
	    		screen.setText(Float.toString(total));
	    		btPressCount = 0;
	    	} else if (btPressCount == 3) {
	    		total = Float.parseFloat(firstVal) * Float.parseFloat(secondVal);
	    		screen.setText(Float.toString(total));
	    		btPressCount = 0;
	    	} else if (btPressCount == 4) {
	    		total = Float.parseFloat(firstVal) / Float.parseFloat(secondVal);
	    		screen.setText(Float.toString(total));
	    		btPressCount = 0;
	    	}
			break;
		}
	}
    
    public void addNumberToDisplay(String number, String changeVal) {
    	if (changeVal.equals("firstVal")) {
	    	firstVal = screen.getText().toString();
	    	if (firstVal.equals("0")) {
	    		firstVal = "";
	    		firstVal = firstVal + number;
	    		screen.setText(firstVal);
	    	} else {
	    		firstVal = firstVal + number;
	    		screen.setText(firstVal);
	    	}
    	} else if (changeVal.equals("secondVal")) {
    		secondVal = screen.getText().toString();
	    	if (secondVal.equals("0")) {
	    		secondVal = "";
	    		secondVal = secondVal + number;
	    		screen.setText(secondVal);
	    	} else {
	    		secondVal = secondVal + number;
	    		screen.setText(secondVal);
	    	}    	
    	}
    }
    
    private void setScreenZero() {
    	screen.setText(R.string.startingZero);
    }
    
    public boolean containsDecimal(String screenVal) {
    	if (screenVal.contains(".")) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void init() {
    	screen = (EditText) findViewById(R.id.numberDisplay);
    	bt0 = (Button) findViewById(R.id.bt0);
    	bt0.setOnClickListener(this);
    	bt1 = (Button) findViewById(R.id.bt1);
    	bt1.setOnClickListener(this);
    	bt2 = (Button) findViewById(R.id.bt2);
    	bt2.setOnClickListener(this);
    	bt3 = (Button) findViewById(R.id.bt3);
    	bt3.setOnClickListener(this);
    	bt4 = (Button) findViewById(R.id.bt4);
    	bt4.setOnClickListener(this);
		bt5 = (Button) findViewById(R.id.bt5);
		bt5.setOnClickListener(this);
		bt6 = (Button) findViewById(R.id.bt6);
		bt6.setOnClickListener(this);
		bt7 = (Button) findViewById(R.id.bt7);
		bt7.setOnClickListener(this);
		bt8 = (Button) findViewById(R.id.bt8);
		bt8.setOnClickListener(this);
		bt9 = (Button) findViewById(R.id.bt9);
		bt9.setOnClickListener(this);
		btPlus = (Button) findViewById(R.id.btPlus);
		btPlus.setOnClickListener(this);
		btMinus = (Button) findViewById(R.id.btMinus);
		btMinus.setOnClickListener(this);
		btMulti = (Button) findViewById(R.id.btMulti);
		btMulti.setOnClickListener(this);
		btDiv = (Button) findViewById(R.id.btDiv);
		btDiv.setOnClickListener(this);
		btC = (Button) findViewById(R.id.btC);
		btC.setOnClickListener(this);
		btDec = (Button) findViewById(R.id.btDec);
		btDec.setOnClickListener(this);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

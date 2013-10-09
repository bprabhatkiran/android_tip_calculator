package com.codepath.example.mytipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculator extends Activity {
	public EditText etBillAmount;
	public TextView tvTipAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        etBillAmount = (EditText) findViewById(R.id.etBillAmount);
        tvTipAmount = (TextView) findViewById(R.id.tvTipAmount);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
    @SuppressWarnings("unused")
	private String getTipAmount(int percentage) {
    	return getTipAmount(percentage * 1.0);
    }
    
    private String getTipAmount(double percentage) {
    	String billAmountString = etBillAmount.getText().toString();
    	double billAmount = Double.valueOf(billAmountString).doubleValue();
    	double result = ((billAmount * 1.0 * percentage)/100.0);
    	String resultString = Double.toString(result);
    	return resultString;
    }
    
    public void calculatePercent10(View v) {
    	tvTipAmount.setText(getTipAmount(10.0));
    }
    
    public void calculatePercent15(View v) {
    	tvTipAmount.setText(getTipAmount(15.0));
    }
    
    public void calculatePercent20(View v) {
    	tvTipAmount.setText(getTipAmount(20.0));
    }
    
}

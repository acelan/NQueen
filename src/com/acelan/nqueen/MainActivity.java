package com.acelan.nqueen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private TextView mResult;
	private Button mButton;
	private EditText mInput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mInput=(EditText)findViewById(R.id.editText1);
		mButton=(Button)findViewById(R.id.button1);
		mResult=(TextView)findViewById(R.id.textResult1);
		
		mButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int input = Integer.parseInt(mInput.getText().toString());
	    long start, stop;
	    int result;
	    String out = "";
	    
	    // Dalvik
	    start = System.currentTimeMillis();
	    result = nQueenLib.nQueenCount(input);
	    stop = System.currentTimeMillis();
	    out += String.format("\nDalvik: %d (%d msec)", result, stop - start);
	    
	    // Native
	    start = System.currentTimeMillis();
	    result = nQueenCount(input);
	    stop = System.currentTimeMillis();
	    out += String.format("\nNative: %d (%d msec)", result, stop - start);
	    
	    mResult.setText(out);
	}
	
    private int nQueenCountDalvik(int input) {
		// TODO Auto-generated method stub
		return 0;
	}

	static {
        System.loadLibrary("nqueen");
    }
	public native int nQueenCount(int n);

}

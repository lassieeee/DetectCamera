package com.oxinrong;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class checkActivity extends Activity {
	 private TextView mTextView;
	  private EditText mEditText; 
	  /** Called when the activity is first created. */ 
	  @Override 
	  public void onCreate(Bundle savedInstanceState) 
	  { 
	    super.onCreate(savedInstanceState); 
	    setContentView(R.layout.activity_check); 
	    mTextView = (TextView)findViewById(R.id.myTextView);
	    mEditText = (EditText)findViewById(R.id.myEditText); 
	    mEditText.setOnKeyListener(new EditText.OnKeyListener() 
	    { 
	      @Override 
	      public boolean onKey(View arg0, int arg1, KeyEvent arg2)
	      {
	        // TODO Auto-generated method stub
	        mTextView.setText(mEditText.getText()); 
	        /*判断输入的类型是何种，并与系统链接*/
	        Linkify.addLinks(mTextView,Linkify.WEB_URLS|Linkify. EMAIL_ADDRESSES|Linkify.PHONE_NUMBERS);
	        return false;
	        } 
	      });
	    } 
}

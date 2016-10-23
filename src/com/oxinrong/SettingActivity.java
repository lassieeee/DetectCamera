package com.oxinrong;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SettingActivity extends Activity {
	 private TextView mTextView;
	  private EditText mEditText; 
	  /** Called when the activity is first created. */ 
	  @Override 
	  public void onCreate(Bundle savedInstanceState) 
	  { 
	    super.onCreate(savedInstanceState); 
	    setContentView(R.layout.activity_setting); 
	    mTextView = (TextView)findViewById(R.id.settingTextView);
	   
	    } 
}

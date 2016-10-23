package com.oxinrong; 


/* import���class */
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;



public class MainActivity extends Activity 
{
  /** Called when the activity is first created. */ 
  @Override 
  public void onCreate(Bundle savedInstanceState)
  { 
    super.onCreate(savedInstanceState);
    /* ����main.xml Layout */ 
    setContentView(R.layout.activity_main);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */
    Button b1 = (Button) findViewById(R.id.button1);
    b1.setOnClickListener(new Button.OnClickListener()
    { 
      public void onClick(View v) 
      {
        /* newһ��Intent���󣬲�ָ��Ҫ������class */ 
        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this, com.oxinrong.CameraActivity.class); 
        /* ����һ���µ�Activity */ startActivity(intent);
       // /* �ر�ԭ����Activity */ MainActivity.this.finish();
        } 
      });
    } 
  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
  	menu.add(0,0,0,"About");
  	menu.add(0,1,1,"Help");
  	return super.onCreateOptionsMenu(menu);
  }
  
  @Override
 	public boolean onOptionsItemSelected(MenuItem item) {
     	super.onOptionsItemSelected(item);
     	switch(item.getItemId()) {
     	case 0:
     		openOptionsDialogAbout();
     		break;
     	case 1:
     		openOptionsDialogHelp();
     		break;
     	}
     	return true;
     }  
     
 	private void openOptionsDialogAbout() {
 		TextView tv = new TextView(this);
 		tv.setText("About");	//����
 		tv.setTextSize(22);//�����С
 		tv.setTextColor(Color.parseColor("#3299CC"));//��ɫ
         tv.setPadding(30, 20, 10, 10);//λ��  
 		new AlertDialog.Builder(this)
 		.setCustomTitle(tv)
 		.setMessage("About")
 		.setPositiveButton("ok",
 				new DialogInterface.OnClickListener() {
 					
 					@Override
 					public void onClick(DialogInterface arg0, int arg1) {
 						// TODO Auto-generated method stub
 						
 					}
 				}
 		).show();
 		
 	}

 	 private void openOptionsDialogHelp() {
 		 TextView tv = new TextView(this);
 			tv.setText("Help");	//����
 			tv.setTextSize(22);//�����С
 			tv.setTextColor(Color.parseColor("#3299CC"));//��ɫ
 	        tv.setPadding(30, 20, 10, 10);//λ��  
 			new AlertDialog.Builder(this)
 			.setCustomTitle(tv)
 			.setMessage("Help")
 			.setPositiveButton("ok",
 					new DialogInterface.OnClickListener() {
 						
 						@Override
 						public void onClick(DialogInterface arg0, int arg1) {
 							// TODO Auto-generated method stub
 							
 						}
 					}
 			).show();
 			
 		}
  }
package com.oxinrong;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class WelcomeActivity extends Activity implements Runnable {
	public static final int VERSION = 1;
	public static SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������  
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//ȫ��
		setContentView(R.layout.activity_welcome);
		// ����һ���ӳ��߳�
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			// �ӳ�����ʱ��
			Thread.sleep(2000);
			// ��ȡSharedPreferences����Ҫ������
			sp = getSharedPreferences("Setting", Context.MODE_PRIVATE);
			/**
			 * ����û����ǵ�һ��ʹ����ֱ�ӵ�ת����ʾ����,�����ת����������
			 */
			if (sp.getInt("VERSION", 0) != VERSION) {
				startActivity(new Intent(WelcomeActivity.this,
						GuideActivity.class));
			} else {
				startActivity(new Intent(WelcomeActivity.this,
						CameraActivity.class));
			}
			finish();

		} catch (Exception e) {
		}
	}
}

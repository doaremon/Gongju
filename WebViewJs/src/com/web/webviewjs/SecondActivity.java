package com.web.webviewjs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//在这个方法中得到想对于的值
		TextView textView=new TextView(SecondActivity.this);
		Intent intent=getIntent();
		String s=intent.getStringExtra("id");
		textView.setText(s);
		setContentView(textView);
	}
}

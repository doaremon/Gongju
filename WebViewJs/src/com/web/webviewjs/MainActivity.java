package com.web.webviewjs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
/**
 * webview DEMO
 * chenghao
 *@ClassName: MainActivity 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author A18ccms a18ccms_gmail_com
 * @date 2016-3-9 下午3:55:43 
 * @author jindanke
 *
 */
public class MainActivity extends Activity {
	private WebView mWebView;
	private String url="file:///android_asset/Demo2.html";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mWebView=(WebView) findViewById(R.id.myweb);
		showWebView();
	}
	//加载web代码
	@SuppressLint("SetJavaScriptEnabled")
	private void showWebView() {
		mWebView.requestFocus();
		//这个方法必须加上，要不不执行
		mWebView.setWebChromeClient(new WebChromeClient(){

			@Override
			public void onProgressChanged(WebView view, int newProgress) {
				super.onProgressChanged(view, newProgress);
			}});

		//设置可以加载js
		WebSettings webSettings = mWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setDefaultTextEncodingName("utf-8");
		mWebView.addJavascriptInterface(new JsOperation(MainActivity.this), "client");
		mWebView.loadUrl(url);		
	}



}

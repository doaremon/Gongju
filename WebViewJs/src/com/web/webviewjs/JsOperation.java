package com.web.webviewjs;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
/**
 * 工具类
 *@ClassName: JsOperation 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author A18ccms a18ccms_gmail_com
 * @date 2016-3-9 下午3:57:29 
 * @author jindanke
 *
 */
public class JsOperation {
	Context context;

	public JsOperation(Context context) {
		this.context = context;
	}
	@JavascriptInterface
	public void showtoast(String str){
		Intent intent=new Intent(context, SecondActivity.class);
		intent.putExtra("id", str);
		context.startActivity(intent);
		Toast.makeText(context, "android yuansheng", Toast.LENGTH_LONG).show();
	}


}

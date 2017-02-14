package com.cn.chason.allpush.activity;



import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.cn.chason.allpush.MyListener;
import com.cn.chason.allpush.PullToRefreshLayout;
import com.cn.chason.allpush.R;

public class PullableWebViewActivity extends Activity
{
	private WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		((PullToRefreshLayout) findViewById(R.id.refresh_view))
				.setOnRefreshListener(new MyListener());
		webView = (WebView) findViewById(R.id.content_view);
		webView.loadUrl("http://blog.csdn.net/a_chaon");
	}
}

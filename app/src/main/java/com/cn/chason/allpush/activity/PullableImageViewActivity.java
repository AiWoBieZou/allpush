package com.cn.chason.allpush.activity;



		import android.app.Activity;
		import android.os.Bundle;

		import com.cn.chason.allpush.MyListener;
		import com.cn.chason.allpush.PullToRefreshLayout;
		import com.cn.chason.allpush.R;

public class PullableImageViewActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imageview);
		((PullToRefreshLayout) findViewById(R.id.refresh_view))
				.setOnRefreshListener(new MyListener());
	}
}
package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.helloandroid.flipper.FlipperTestActivity;
import com.example.helloandroid.flipper.FlipperWithAsyncTaskActivity;
import com.example.helloandroid.tab.TabTestActivity;

public class HelloAndroid extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);

		TextView tv = new TextView(this);
		tv.setText("Hello, Android");
		layout.addView(tv, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		Button flipperTest = new Button(this);
		flipperTest.setText("Flipper Test");
		layout.addView(flipperTest, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		flipperTest.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HelloAndroid.this, FlipperTestActivity.class);
				startActivity(intent);
			}
		});

		Button asyncFlipperTest = new Button(this);
		asyncFlipperTest.setText("Flipper with Async Test");
		layout.addView(asyncFlipperTest, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		asyncFlipperTest.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(HelloAndroid.this, FlipperWithAsyncTaskActivity.class));
			}
		});

		Button tabTest = new Button(this);
		tabTest.setText("Tab Test");
		layout.addView(tabTest, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		tabTest.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HelloAndroid.this, TabTestActivity.class);
				startActivity(intent);
			}
		});

		setContentView(layout);

	}

}

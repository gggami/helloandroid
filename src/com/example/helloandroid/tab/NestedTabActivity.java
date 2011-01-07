package com.example.helloandroid.tab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.helloandroid.R;

public class NestedTabActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);

		TabHost tabHost = getTabHost();
		tabHost.addTab(
			tabHost.newTabSpec("tab1-1")
					.setIndicator("Tab1-1")
					.setContent(new Intent(this, TabContent1Activity.class))
					);

		tabHost.addTab(
			tabHost.newTabSpec("tab1-2")
					.setIndicator("Tab1-2")
					.setContent(new Intent(this, TabContent1Activity.class))
					);
	}

}

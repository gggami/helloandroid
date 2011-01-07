package com.example.helloandroid.tab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.helloandroid.R;

public class TabTestActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);

		TabHost tabHost = getTabHost();

		tabHost.addTab(
			tabHost.newTabSpec("tab1")
					.setIndicator("Tab1")
					.setContent(new Intent(this, NestedTabActivity.class))
					);

		//		tabHost.addTab(
		//			tabHost.newTabSpec("tab2")
		//					.setIndicator("Tab2")
		//					.setContent(new Intent(this, NestedTabActivity2.class))
		//					);

		tabHost.addTab(
			tabHost.newTabSpec("tab2")
					.setIndicator("Tab2")
					.setContent(new Intent(this, TabContent1Activity.class))
					);

	}
}

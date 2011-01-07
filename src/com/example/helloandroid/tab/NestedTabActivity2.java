package com.example.helloandroid.tab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.helloandroid.R;

public class NestedTabActivity2 extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);

		TabHost tabHost = getTabHost();
		tabHost.addTab(
			tabHost.newTabSpec("tab2-1")
					.setIndicator("Tab2-1")
					.setContent(new Intent(this, TabContent1Activity.class))
					);

		tabHost.addTab(
			tabHost.newTabSpec("tab2-2")
					.setIndicator("Tab2-2")
					.setContent(new Intent(this, TabContent1Activity.class))
					);
	}

}

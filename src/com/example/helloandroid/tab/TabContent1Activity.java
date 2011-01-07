package com.example.helloandroid.tab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TabContent1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView view = new TextView(this);
		view.setText("content1");
		setContentView(view);

		Button button = new Button(this);
		button.setText("show dialog");
		setContentView(button);

		// これはerrorになる
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(TabContent1Activity.this);
				dialogBuilder.setMessage("This is a dialog.");
				dialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				dialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				dialogBuilder.create().show();
			}
		});
	}

}

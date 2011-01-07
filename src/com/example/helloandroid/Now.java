package com.example.helloandroid;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Now extends Activity implements OnClickListener {

	Button btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.now);

		btn = (Button)findViewById(R.id.button);
		btn.setOnClickListener(this);
		updateTime();

	}

	@Override
	public void onClick(View v) {
		updateTime();
	}

	private void updateTime() {
		btn.setText(new Date().toString());
	}

}

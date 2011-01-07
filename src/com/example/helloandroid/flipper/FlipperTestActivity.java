package com.example.helloandroid.flipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.helloandroid.R;

public class FlipperTestActivity extends Activity implements OnClickListener {

	private ViewFlipper viewFlipper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipper_main);

		viewFlipper = (ViewFlipper)findViewById(R.id.flipper);

		Button prevButton = (Button)findViewById(R.id.prev_button);
		Button nextButton = (Button)findViewById(R.id.next_button);
		Button specifyIdButton = (Button)findViewById(R.id.specify_id_button);

		prevButton.setOnClickListener(this);
		nextButton.setOnClickListener(this);
		specifyIdButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.prev_button:
				viewFlipper.showPrevious();
				break;
			case R.id.next_button:
				viewFlipper.showNext();
				break;
			case R.id.specify_id_button:
				//viewFlipper.setInAnimation(this, R.id.loading_layout);
				viewFlipper.setDisplayedChild(0);
				break;
		}
	}

}

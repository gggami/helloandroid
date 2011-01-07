package com.example.helloandroid.flipper;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.helloandroid.R;

public class FlipperWithAsyncTaskActivity extends Activity {

	private ViewFlipper viewFlipper;
	private Button prevButton;
	private Button nextButton;
	private Button specifyIdButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipper_main);

		viewFlipper = (ViewFlipper)findViewById(R.id.flipper);

		prevButton = (Button)findViewById(R.id.prev_button);
		nextButton = (Button)findViewById(R.id.next_button);
		specifyIdButton = (Button)findViewById(R.id.specify_id_button);

		//		prevButton.setOnClickListener(this);
		//		nextButton.setOnClickListener(this);
		//		specifyIdButton.setOnClickListener(this);

		new BackgroundTask().execute();
	}

	private class BackgroundTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... arg0) {
			Log.d("FlipperWithAsyncTest", "doInBackground");
			OnClickListener listener = new OnClickListener() {
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
			};

			prevButton.setOnClickListener(listener);
			nextButton.setOnClickListener(listener);
			specifyIdButton.setOnClickListener(listener);

			new CustomFlipper(FlipperWithAsyncTaskActivity.this);

			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			Log.d("FlipperWithAsyncTest", "onPostExecute");
			super.onPostExecute(result);

			viewFlipper.showNext();
		}
	}

}

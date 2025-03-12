package sss.am71113363.fakepayapp;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		finish();
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		finish();
	}
}


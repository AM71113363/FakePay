package sss.am71113363.fakepayapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ThePayFake extends Service
{
	@Override
	public void onCreate()
	{
		super.onCreate();
		stopSelf();
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}

package sss.am71113363.fakepayapp;

import android.content.Intent;
import android.os.IBinder;
import android.nfc.cardemulation.OffHostApduService;

public class TheOffPay extends OffHostApduService
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

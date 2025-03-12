package sss.am71113363.fakepayapp;

import android.content.Intent;
import android.os.IBinder;
import android.nfc.cardemulation.HostApduService;
import android.os.*;

public class TheHostPay extends HostApduService
{

	@Override
	public byte[] processCommandApdu(byte[] p1, Bundle p2)
	{
		// TODO: Implement this method
		return new byte[]{ (byte)0x90,(byte)0x00};
	}

	@Override
	public void onDeactivated(int p1)
	{
	}

}

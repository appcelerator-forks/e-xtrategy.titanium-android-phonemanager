package it.extrategy.phonemanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class ServiceReceiver extends BroadcastReceiver {
	
	PhonemanagerModule _module = null;
	
	public ServiceReceiver(PhonemanagerModule module) {
		_module = module;
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		MyPhoneStateListener phoneListener = new MyPhoneStateListener(_module);
		TelephonyManager telephony = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephony.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
	}

}

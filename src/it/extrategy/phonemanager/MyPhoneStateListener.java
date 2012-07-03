package it.extrategy.phonemanager;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class MyPhoneStateListener extends PhoneStateListener {
	
	private PhonemanagerModule _module = null;
	
	public MyPhoneStateListener(PhonemanagerModule mainModule) {
		_module = mainModule;
		
	}
	
	@Override
	public void onCallStateChanged(int state, String incomingNumber) {
		// TODO Auto-generated method stub
		switch (state) {
		case TelephonyManager.CALL_STATE_IDLE:
			_module.firePhoneStatusChanged("idle");
			break;
		case TelephonyManager.CALL_STATE_OFFHOOK:
			_module.firePhoneStatusChanged("offhook");
			break;
		case TelephonyManager.CALL_STATE_RINGING:
			_module.firePhoneStatusChanged("ringing");
			break;
		}
	}
}
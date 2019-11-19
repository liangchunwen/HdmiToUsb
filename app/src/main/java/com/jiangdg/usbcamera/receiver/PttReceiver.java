package com.jiangdg.usbcamera.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.jiangdg.usbcamera.view.USBCameraActivity;

public class PttReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("com.runbo.ptt.key.down")) {
            if (!USBCameraActivity.startFlag) {
                Intent mIntent = new Intent(context, USBCameraActivity.class);
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(mIntent);
            }
        }
    }
}

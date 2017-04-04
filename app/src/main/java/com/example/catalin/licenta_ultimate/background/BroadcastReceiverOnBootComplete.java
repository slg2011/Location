package com.example.catalin.licenta_ultimate.background;

import android.content.BroadcastReceiver;

import android.content.Context;

import android.content.Intent;


/**
 * Created by Catalin on 27-Mar-17.
 */

public class BroadcastReceiverOnBootComplete extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, ControlService.class);
            context.startService(serviceIntent);
        }


    }

}

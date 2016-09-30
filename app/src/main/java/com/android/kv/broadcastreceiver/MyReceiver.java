package com.android.kv.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by lakshmimohandev on 9/29/16.
 */
public class MyReceiver extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, " Airplane Mode Enabled!!!!.", Toast.LENGTH_LONG).show();
    }
}
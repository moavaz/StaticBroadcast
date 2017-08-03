package com.example.moavaz.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MyReceiver extends BroadcastReceiver {

    public MyReceiver(){
        
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: wifi state changed");
        Log.d(TAG, "onReceive: airplanemode changed");
    }
}

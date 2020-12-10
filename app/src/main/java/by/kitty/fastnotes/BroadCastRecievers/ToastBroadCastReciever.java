package by.kitty.fastnotes.BroadCastRecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import by.kitty.fastnotes.Services.ToastService;

public class ToastBroadCastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("message");
        if(!(context != null && message != null && message.isEmpty())) return;

        ToastService.showToast(context, message);
    }
}

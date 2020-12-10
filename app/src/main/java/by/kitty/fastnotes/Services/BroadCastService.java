package by.kitty.fastnotes.Services;

import android.content.Context;
import android.content.Intent;

import by.kitty.fastnotes.R;

public class BroadCastService {

    public void fireShowToastBroadCast(Context context, String message) {
        Intent intentToBroadcast = new Intent( context.getString(R.string.toast_message_action_type));

        intentToBroadcast.putExtra("message", message);
        context.sendBroadcast(intentToBroadcast);
    }

}

package com.android.voicehelper.action;

import android.content.Intent;

import com.android.voicehelper.MainActivity;


public class CallView {

    private MainActivity mActivity;

    public CallView(MainActivity activity) {
        mActivity = activity;
    }

    public void start() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL_BUTTON);
        mActivity.startActivity(intent);
    }
}

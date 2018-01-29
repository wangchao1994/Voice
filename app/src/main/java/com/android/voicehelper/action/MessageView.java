package com.android.voicehelper.action;

import android.content.Intent;

import com.android.voicehelper.MainActivity;


public class MessageView {
	private MainActivity mActivity;
	
	public MessageView(MainActivity activity){
		mActivity=activity;
	}
	
	public void start(){
		Intent intent=new Intent();
		intent.setClassName("com.android.mms","com.android.mms.ui.ConversationList");
		mActivity.startActivity(intent);
	}
}

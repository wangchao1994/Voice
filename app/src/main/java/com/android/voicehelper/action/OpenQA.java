package com.android.voicehelper.action;

import com.android.voicehelper.MainActivity;

public class OpenQA {

	private String mText;
	MainActivity mActivity;
	
	public OpenQA(String text, MainActivity activity){
		mText=text;
		mActivity=activity;
	}
	
	public void start(){
		mActivity.speakAnswer(mText);
	}
	
}

package com.thunder.xunfeitest;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by CHENQIAO on 2017/4/26 17:06.
 * E-mail: mrjctech@gmail.com
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(App.this, SpeechConstant.APPID +"=58eeee06");
    }
}

package com.rn_weiyue;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    private SharedPreferences mPreferences;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        mPreferences.edit().putString("debug_http_host","172.17.17.49:8088").commit();//pc端ip地址
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "RN_Weiyue";
    }
}

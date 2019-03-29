package com.isaacurbna.daggerapplication;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class Main2Activity extends DaggerAppCompatActivity {

    private static final String TAG = Main2Activity.class.getSimpleName();

    @Inject
    String localClassName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i(TAG, "onCreate: localClassName: " + localClassName);
    }
}

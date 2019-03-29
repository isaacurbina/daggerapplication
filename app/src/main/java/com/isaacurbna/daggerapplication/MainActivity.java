package com.isaacurbna.daggerapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.isaacurbna.daggerapplication.model.BackendService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    BackendService backendService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyDaggerApplication) getApplication())
                .getMyComponent()
                .inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
        callServer();
    }

    private void callServer() {
        Log.i(TAG, "callServer: ");
        if (backendService.callServer()) {
            Log.i(TAG, "callServer: Server call was successful.");
        } else {
            Log.e(TAG, "callServer: Server call failed.");
        }
    }
}

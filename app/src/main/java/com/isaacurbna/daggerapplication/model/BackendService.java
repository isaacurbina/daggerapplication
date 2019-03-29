package com.isaacurbna.daggerapplication.model;

import android.text.TextUtils;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class BackendService {

    private static final String TAG = BackendService.class.getSimpleName();

    private User user;

    private final String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl,
                          User user) {
        this.serverUrl = serverUrl;
        this.user = user;
    }

    public boolean callServer() {
        Log.i(TAG, "callServer: user: " + user);
        Log.i(TAG, "callServer: serverUrl: " + serverUrl);
        return user != null && !TextUtils.isEmpty(serverUrl);
    }
}

package com.isaacurbna.daggerapplication;

import android.util.Log;

import com.isaacurbna.daggerapplication.diandroidinjection.DaggerAppComponent;
import com.isaacurbna.daggerapplication.disimple.DaggerMyComponent;
import com.isaacurbna.daggerapplication.disimple.MyComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyDaggerApplication extends DaggerApplication {

    private static final String TAG = MyDaggerApplication.class.getSimpleName();

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate: ");
        super.onCreate();
        myComponent = DaggerMyComponent.create();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent
                .builder()
                .application(this)
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}

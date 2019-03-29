package com.isaacurbna.daggerapplication.diandroidinjection;

import android.support.v7.app.AppCompatActivity;

import com.isaacurbna.daggerapplication.Main2Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class Main2ActivityModule {

    @Binds
    abstract AppCompatActivity main2Activity(Main2Activity activity);

    @Provides
    static String provideMain2ActivityName(AppCompatActivity activity) {
        return activity.getLocalClassName();
    }
}

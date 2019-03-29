package com.isaacurbna.daggerapplication.diandroidinjection;

import com.isaacurbna.daggerapplication.Main2Activity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {
        AndroidInjectionModule.class
})
abstract class ActivityBindingsModule {

    @PerActivity
    @ContributesAndroidInjector(modules = Main2ActivityModule.class)
    abstract Main2Activity main2ActivityInjector();
}

package com.isaacurbna.daggerapplication.diandroidinjection;

import android.app.Application;

import com.isaacurbna.daggerapplication.MyDaggerApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBindingsModule.class
})
public interface AppComponent extends AndroidInjector<MyDaggerApplication> {

    @Override
    void inject(MyDaggerApplication instance);

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}

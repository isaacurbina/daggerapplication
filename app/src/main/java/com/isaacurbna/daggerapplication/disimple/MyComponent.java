package com.isaacurbna.daggerapplication.disimple;

import com.isaacurbna.daggerapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UserModule.class, BackendServiceModule.class})
public interface MyComponent {

    void inject(MainActivity mainActivity);
}

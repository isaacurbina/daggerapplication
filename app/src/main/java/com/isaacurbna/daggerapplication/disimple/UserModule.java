package com.isaacurbna.daggerapplication.disimple;

import com.isaacurbna.daggerapplication.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser() {
        return new User("Isaac", "Urbina");
    }
}

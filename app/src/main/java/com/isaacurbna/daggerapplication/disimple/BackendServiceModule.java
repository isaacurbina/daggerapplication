package com.isaacurbna.daggerapplication.disimple;

import com.isaacurbna.daggerapplication.model.BackendService;
import com.isaacurbna.daggerapplication.model.User;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BackendServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serverUrl,
                                         User user) {
        return new BackendService(serverUrl, user);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "https://www.vogella.com/";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }

}

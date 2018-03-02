package com.model.andreymurzin.modelapp.app;

import android.app.Activity;
import android.app.Application;


import com.model.andreymurzin.modelapp.app.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .withContext(this)
                .build()
                .inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}

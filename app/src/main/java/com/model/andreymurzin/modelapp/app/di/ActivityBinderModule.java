package com.model.andreymurzin.modelapp.app.di;

import com.model.andreymurzin.modelapp.app.di.scope.ActivityScope;
import com.model.andreymurzin.modelapp.presentation.main.MainActivity;
import com.model.andreymurzin.modelapp.presentation.main.di.MainModule;
import com.model.andreymurzin.modelapp.presentation.start.StartActivity;
import com.model.andreymurzin.modelapp.presentation.start.di.StartModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface ActivityBinderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = StartModule.class)
    StartActivity splashActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    MainActivity mainActivityInjector();
}

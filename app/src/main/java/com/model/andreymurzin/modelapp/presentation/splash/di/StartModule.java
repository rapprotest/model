package com.model.andreymurzin.modelapp.presentation.splash.di;


import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.app.di.scope.ActivityScope;
import com.model.andreymurzin.modelapp.navigation.SplashActivityNavigator;
import com.model.andreymurzin.modelapp.presentation.splash.StartActivity;

import dagger.Module;
import dagger.Provides;
import ru.terrakok.cicerone.android.SupportAppNavigator;

@Module
public class StartModule {

    @Provides
    @ActivityScope
    static SupportAppNavigator provideSplashNavigator(StartActivity activity){
        return new SplashActivityNavigator(activity, R.id.container);
    }
}

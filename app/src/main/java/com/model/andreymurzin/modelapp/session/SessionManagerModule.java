package com.model.andreymurzin.modelapp.session;


import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SessionManagerModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPreference(Context context) {
        return context.getSharedPreferences("models.prefs", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    SharedPrefsManager provideSharedPreferenceManager(SharedPreferences sharedPreferences) {
        return new SharedPrefsManager(sharedPreferences);
    }

    @Provides
    @Singleton
    SessionManager provideSessionManager(SharedPrefsManager sharedPrefsManager) {
        return new SessionManager(sharedPrefsManager);
    }
}

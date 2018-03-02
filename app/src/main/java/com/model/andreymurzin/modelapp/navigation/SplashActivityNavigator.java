package com.model.andreymurzin.modelapp.navigation;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.model.andreymurzin.modelapp.presentation.main.MainActivity;
import com.model.andreymurzin.modelapp.presentation.splash.StartActivity;

import ru.terrakok.cicerone.android.SupportAppNavigator;

public class SplashActivityNavigator extends SupportAppNavigator {

    private StartActivity activity;

    public SplashActivityNavigator(StartActivity activity, int containerId) {
        super(activity, containerId);
        this.activity = activity;
    }

    @Override
    protected Intent createActivityIntent(String screenKey, Object data) {
        switch (screenKey) {
            case Screen.MAIN_SCREEN: {
                return new Intent(activity, MainActivity.class);
            }
        }
        return null;
    }

    @Override
    protected Fragment createFragment(String screenKey, Object data) {
        return null;
    }
}

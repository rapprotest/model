package com.model.andreymurzin.modelapp.navigation;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.model.andreymurzin.modelapp.presentation.main.MainActivity;

import ru.terrakok.cicerone.android.SupportAppNavigator;

public class MainActivityNavigation extends SupportAppNavigator {

    private MainActivity activity;

    public MainActivityNavigation(MainActivity activity, int containerId) {
        super(activity, containerId);
        this.activity = activity;
    }

    @Override
    protected Intent createActivityIntent(String screenKey, Object data) {
        return null;
    }

    @Override
    protected Fragment createFragment(String screenKey, Object data) {
        return null;
    }
}

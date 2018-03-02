package com.model.andreymurzin.modelapp.presentation.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.model.andreymurzin.modelapp.app.Layout;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import ru.terrakok.cicerone.NavigatorHolder;

public abstract class BaseActivity extends MvpAppCompatActivity
        implements HasSupportFragmentInjector {

    @Inject
    protected DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    protected NavigatorHolder navigatorHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        Class<?> cls = this.getClass();
        if (!cls.isAnnotationPresent(Layout.class)) {
            throw new IllegalArgumentException("Please specify LayoutRes" +
                    " for activity in @Layout annotation");
        }
        Layout layout = cls.getAnnotation(Layout.class);
        setContentView(layout.value());
        ButterKnife.bind(this);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}

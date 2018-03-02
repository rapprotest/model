package com.model.andreymurzin.modelapp.presentation.base;


import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.model.andreymurzin.modelapp.app.Layout;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.support.HasSupportFragmentInjector;
import ru.terrakok.cicerone.NavigatorHolder;

public abstract class BaseActivity extends MvpAppCompatActivity  {

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
}

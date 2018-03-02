package com.model.andreymurzin.modelapp.presentation.start;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.app.Layout;
import com.model.andreymurzin.modelapp.presentation.base.BaseActivity;

import javax.inject.Inject;

import ru.terrakok.cicerone.android.SupportAppNavigator;

@Layout(R.layout.start_activity)
public class StartActivity extends BaseActivity implements StartView {

    @Inject
    @InjectPresenter
    StartPresenter presenter;
    @Inject
    SupportAppNavigator navigator;

    @ProvidePresenter
    public StartPresenter providePresenter() {
        return presenter;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.isValidSession();

    }

    @Override
    public void showError(String error) {

    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        navigatorHolder.setNavigator(navigator);
    }

    @Override
    protected void onPause() {
        navigatorHolder.removeNavigator();
        super.onPause();
    }
}

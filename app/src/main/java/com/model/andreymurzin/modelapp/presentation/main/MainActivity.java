package com.model.andreymurzin.modelapp.presentation.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.app.Layout;
import com.model.andreymurzin.modelapp.presentation.base.BaseToolbarActivity;
import com.model.andreymurzin.modelapp.utils.delegat.ToolbarTitleDelegate;
import com.model.andreymurzin.modelapp.utils.helper.BottomViewHelper;

import javax.inject.Inject;

import butterknife.BindView;
import ru.terrakok.cicerone.android.SupportAppNavigator;


@Layout(R.layout.activity_main)
public class MainActivity extends BaseToolbarActivity implements MainView {

    @Inject
    BottomViewHelper bottomViewHelper;
    @Inject
    ToolbarTitleDelegate toolbarTitleDelegate;
    @Inject
    SupportAppNavigator navigator;
    @Inject
    @InjectPresenter
    MainPresenter presenter;

    @ProvidePresenter
    public MainPresenter providePresenter() {
        return presenter;
    }

    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bottomViewHelper.disableAnimationBottomView(bottomNavigationView);
        setToolbar(toolbar);
        toolbarTitleDelegate.changeTitle(getString(R.string.title_main));
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView
                        .OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                presenter.navigationTo(item);
                return false;
            }
        });
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

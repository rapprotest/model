package com.model.andreymurzin.modelapp.presentation.main;


import android.view.MenuItem;

import com.arellomobile.mvp.InjectViewState;
import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.navigation.Screen;
import com.model.andreymurzin.modelapp.presentation.base.BasePresenter;

import javax.inject.Inject;

import ru.terrakok.cicerone.Router;

@InjectViewState
public class MainPresenter extends BasePresenter<MainView> {

    private Router router;

    @Inject
    MainPresenter(Router router) {
        this.router = router;
    }

    void navigationTo(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_home:
                router.navigateTo(Screen.HOME_SCREEN);
                break;
            case R.id.item_favorite:
                router.navigateTo(Screen.FAVORITE_SCREEN);
                break;
            case R.id.item_profile:
                router.navigateTo(Screen.PROFILE_SCREEN);
                break;
            case R.id.item_search:
                router.navigateTo(Screen.SEARCH_SCREEN);
                break;
        }
    }
}

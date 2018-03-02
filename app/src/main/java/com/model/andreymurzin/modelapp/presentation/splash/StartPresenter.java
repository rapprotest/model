package com.model.andreymurzin.modelapp.presentation.splash;


import com.arellomobile.mvp.InjectViewState;
import com.model.andreymurzin.modelapp.navigation.Screen;
import com.model.andreymurzin.modelapp.presentation.base.BasePresenter;
import com.model.andreymurzin.modelapp.data.session.SessionManager;

import javax.inject.Inject;

import ru.terrakok.cicerone.Router;

@InjectViewState
public class StartPresenter extends BasePresenter<StartView> {

    private final SessionManager sessionManager;
    private final Router router;


    @Inject
    StartPresenter(SessionManager sessionManager, Router router) {
        this.sessionManager = sessionManager;
        this.router = router;
    }


    void isValidSession() {
        router.newRootScreen(Screen.MAIN_SCREEN);
    }

}

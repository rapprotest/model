package com.model.andreymurzin.modelapp.presentation.base;


import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface BaseView extends MvpView {

    @StateStrategyType(SkipStrategy.class)
    void showError(String error);
}

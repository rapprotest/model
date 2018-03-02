package com.model.andreymurzin.modelapp.presentation.main;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;

import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.app.Layout;
import com.model.andreymurzin.modelapp.presentation.base.BaseToolbarActivity;
import com.model.andreymurzin.modelapp.utils.helper.BottomViewHelper;

import javax.inject.Inject;

import butterknife.BindView;


@Layout(R.layout.activity_main)
public class MainActivity extends BaseToolbarActivity {

    @Inject
    BottomViewHelper bottomViewHelper;

    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bottomViewHelper.disableAnimationBottomView(bottomNavigationView);
        setToolbar(toolbar);
    }

}

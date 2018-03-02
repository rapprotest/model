package com.model.andreymurzin.modelapp.utils.delegat;


import android.app.Activity;

import com.model.andreymurzin.modelapp.presentation.base.BaseToolbarActivity;
import com.model.andreymurzin.modelapp.presentation.base.ToolbarManager;

public class ToolbarTitleDelegate {

    private final ToolbarManager manager;

    public ToolbarTitleDelegate(Activity activity) {
        if (activity instanceof ToolbarManager) {
            this.manager = (BaseToolbarActivity) activity;
        } else {
            throw new ClassCastException
                    ("Your activity has to implement BaseToolbarActivity interface");
        }
    }

    public void changeTitle(String title) {
        manager.changeTitle(title);
    }
}

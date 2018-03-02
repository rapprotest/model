package com.model.andreymurzin.modelapp.presentation.base;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.Stack;

public abstract class BaseToolbarActivity extends BaseActivity implements ToolbarManager {

    Stack<String> titleStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titleStack = new Stack<>();
    }

    @Override
    public void changeTitle(String title){
        titleStack.push(title);
        setTitle(title);
    }

    private void setTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public void onBackPressed() {
        if (titleStack.size() > 1) {
            titleStack.pop();
            setTitle(titleStack.peek());
        }
    }

    protected void setToolbar(Toolbar toolbar){
        setSupportActionBar(toolbar);
    }
}

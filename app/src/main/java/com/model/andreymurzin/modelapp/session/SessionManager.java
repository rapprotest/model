package com.model.andreymurzin.modelapp.session;

import android.text.TextUtils;

import javax.inject.Inject;

public class SessionManager {

    private static final String ACCESS_TOKEN_KEY = "ACCESS_TOKEN";
    private static final String REFRESH_TOKEN_KEY = "REFRESH_TOKEN";
    private static final String USER_ID_KEY = "USER_ID";
    private static final String USER_ROLE_KEY = "USER_ROLE_ID";

    private final SharedPrefsManager prefsManager;

    @Inject
    public SessionManager(SharedPrefsManager prefsManager) {
        this.prefsManager = prefsManager;
    }

    public void storeAccessToken(String tokenValue) {
        prefsManager.putString(ACCESS_TOKEN_KEY, tokenValue);
    }

    public void storeRefreshToken(String tokenValue) {
        prefsManager.putString(REFRESH_TOKEN_KEY, tokenValue);
    }

    public void storeUserId(int userId) {
        prefsManager.putInt(USER_ID_KEY, userId);
    }

    public boolean isSessionOpened() {
        return !TextUtils.isEmpty(prefsManager.getString(ACCESS_TOKEN_KEY));
    }

    public String getAccessToken() {
        return prefsManager.getString(ACCESS_TOKEN_KEY);
    }

    public String getRefreshToken() {
        return prefsManager.getString(REFRESH_TOKEN_KEY);
    }

    public int getUserId() {
        return prefsManager.getInt(USER_ID_KEY);
    }

}

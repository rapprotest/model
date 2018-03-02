package com.model.andreymurzin.modelapp.data.session;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import javax.inject.Inject;


public class SharedPrefsManager {

    private final SharedPreferences preferences;

    @Inject
    public SharedPrefsManager(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    public void putString(@NonNull String key, @NonNull String value) {
        preferences
                .edit()
                .putString(key, value)
                .apply();
    }

    public void putInt(@NonNull String key, @NonNull int value) {
        preferences
                .edit()
                .putInt(key, value)
                .apply();
    }

    public void putLong(@NonNull String key, @NonNull long value) {
        preferences.edit()
                .putLong(key,value)
                .apply();
    }

    public long getLong(@NonNull String key){
        return preferences.getLong(key, -1);
    }

    public String getString(@NonNull String key) {
        return preferences.getString(key, "");
    }

    public void putBoolean(@NonNull String key, boolean value) {
        preferences
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    public boolean getBoolean(@NonNull String key) {
        return preferences.getBoolean(key, true);
    }

    public int getInt(@NonNull String key) {
        return preferences.getInt(key, -1);
    }

    public void clear() {
        preferences.edit()
                .clear()
                .apply();
    }

}

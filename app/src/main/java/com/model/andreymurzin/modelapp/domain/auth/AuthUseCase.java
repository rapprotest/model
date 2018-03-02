package com.model.andreymurzin.modelapp.domain.auth;


import com.model.andreymurzin.modelapp.data.auth.AuthGetway;
import com.model.andreymurzin.modelapp.data.entity.User;

import javax.inject.Inject;

import io.reactivex.Single;

public class AuthUseCase {

    private final AuthGetway authGetway;

    @Inject
    public AuthUseCase(AuthGetway authGetway) {
        this.authGetway = authGetway;
    }

    public Single<User> perfomLoginUser(String username, String password) {
        return authGetway.perfomLogin(username, password);
    }
}

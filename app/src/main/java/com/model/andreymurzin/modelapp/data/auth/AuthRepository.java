package com.model.andreymurzin.modelapp.data.auth;


import com.model.andreymurzin.modelapp.data.entity.User;
import com.model.andreymurzin.modelapp.network.ModelApi;

import javax.inject.Inject;

import io.reactivex.Single;

public class AuthRepository implements AuthGetway {

    private final ModelApi modelApi;

    @Inject
    public AuthRepository(ModelApi modelApi) {
        this.modelApi = modelApi;
    }

    @Override
    public Single<User> perfomLogin(String username, String password) {
        return Single.just(getMockUser());
    }

    private User getMockUser() {
        User user = new User();
        user.setId(1);
        user.setAdminAccount(true);
        user.setAge(20);
        user.setFirstName("Ann");
        user.setLastName("Nope");
        user.setUserName("AnnNope");
        return user;
    }
}

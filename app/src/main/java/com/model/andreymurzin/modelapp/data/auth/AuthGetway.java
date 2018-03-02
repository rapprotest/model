package com.model.andreymurzin.modelapp.data.auth;


import com.model.andreymurzin.modelapp.data.entity.User;

import io.reactivex.Single;

public interface AuthGetway {
    Single<User> perfomLogin(String username, String password);
}

package com.apirestjs.apirestjs.services;

import com.apirestjs.apirestjs.models.UserModel;

import java.util.List;

public interface UserService {

    UserModel getUserById(String userId);

    List<UserModel> getAllUsers();

    String deleteUserById(String userId);

    UserModel saveUser(UserModel userModel);
}

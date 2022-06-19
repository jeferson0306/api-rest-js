package com.apirestjs.apirestjs.services.impl;

import com.apirestjs.apirestjs.models.UserModel;
import com.apirestjs.apirestjs.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public UserModel getUserById(String userId) {
        UserModel userModel = new UserModel();
        userModel.setFirstName("TestName");
        userModel.setLastName("TestLast");
        userModel.setCpf("12345698778");
        userModel.setBirthDate("01/02/1993");
        userModel.setEmail("teste@user.com");
        return userModel;
    }

    @Override
    public List<UserModel> getAllUsers() {
        UserModel userModel = new UserModel();
        userModel.setFirstName("TestUser");
        return Collections.singletonList(userModel);
    }

    @Override
    public String deleteUserById(String userId) {
        return "Deleted Sucessfully";
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        return userModel;
    }
}

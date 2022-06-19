package com.apirestjs.apirestjs.controllers;

import com.apirestjs.apirestjs.models.UserModel;
import com.apirestjs.apirestjs.services.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/fetch/{userId}")
    @ApiOperation("Returns Uer based in user id .")
    public UserModel getUserById(@PathVariable  String userId){
        return userService.getUserById(userId);
    }

    @GetMapping("/fetchAll")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{userid}")
    public String deleteUserById(@PathVariable  String  userId){
        return userService.deleteUserById(userId);
    }

    @PostMapping("/create")
    public UserModel saveUser(@RequestBody UserModel userModel){
        return userService.saveUser(userModel);
    }

}

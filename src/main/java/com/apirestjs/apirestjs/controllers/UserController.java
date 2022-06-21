package com.apirestjs.apirestjs.controllers;

import com.apirestjs.apirestjs.models.UserModel;
import com.apirestjs.apirestjs.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/fetch/{userId}")
    @ApiOperation("Returns users based in userId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Indicates success in fetching customer data"),
            @ApiResponse(code = 404, message = "Indicates failure to fetch customer data")
    })
    public UserModel getUserById(@PathVariable  @Valid String userId){
        return userService.getUserById(userId);
    }

    @GetMapping("/fetchAll")
    @ApiOperation("Returns all users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Indicates success in fetching customer data"),
            @ApiResponse(code = 404, message = "Indicates failure to fetch customer data")
    })
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{userid}")
    @ApiOperation(value = "Delete an user by userId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Indicates success in delete customer data"),
            @ApiResponse(code = 404, message = "Indicates failure in delete  customer data")
    })
    public String deleteUserById(@PathVariable  @Valid String  userId){
        return userService.deleteUserById(userId);
    }

    @PostMapping("/create")
    @ApiOperation("Create an user and save in database")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Indicates successful parameter validation"),
            @ApiResponse(code = 404, message = "Indicates error in parameter validation")
    })
    public UserModel saveUser(@RequestBody @Valid UserModel userModel){
        return userService.saveUser(userModel);
    }

}

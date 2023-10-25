package com.Srinath.UserManagement.controller;




import com.Srinath.UserManagement.entity.User;
import com.Srinath.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("users/user/{uId}")
    public User getUser(@PathVariable Integer uId){
        return userService.getUser(uId);
    }
    @GetMapping("users")
    public List<User> getAllUser(){
        return  userService.getAllUsers();
    }
    @PutMapping("users/{uId}")
    public String modifyUser( @PathVariable  Integer uId,@RequestBody User user){
        return userService.modifyUser(uId,user);
    }
    @DeleteMapping("users/{uId}")
    public String removeUser(@PathVariable Integer uId){
        return userService.removeUser(uId);
    }
}


package com.obviousgawu.controller;

import com.obviousgawu.model.User;
import com.obviousgawu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

  UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Read specific user details
    @GetMapping("{id}")
    public User getUserDetails(@PathVariable("id") String id){
        return userService.getUserById(id);

                //User;
        //return new User("Q","Bhudha","12 Zengeza","223456");
    }

    //Read All user details
    @GetMapping()
    public List<User> getAllUserDetails() {

        return userService.getAllUsers();
    }


    @PostMapping
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        //this.user = user;
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        //this.user = user;
        return "User Edited Successfully";
    }
    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
        //new NewCustomer(id);
        //this.user = null;
        return "User Deleted Successfully";
    }

}

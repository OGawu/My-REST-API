package com.obviousgawu.service;

import com.obviousgawu.model.User;

import java.util.List;


public interface UserService {
    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String id);
    public User getUserById(String id);
    public List<User> getAllUsers();

}

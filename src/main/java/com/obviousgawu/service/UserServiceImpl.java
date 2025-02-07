package com.obviousgawu.service;

import com.obviousgawu.model.User;
import com.obviousgawu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "User created successfully";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "User details updated";
    }

    @Override
    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }

    @Override
    public User getUserById(String id) {
       return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}

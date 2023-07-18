package com.example.employee.service;

import com.example.employee.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    boolean deleteUser(Long id);

    User updateUserId(Long id, User user);
}

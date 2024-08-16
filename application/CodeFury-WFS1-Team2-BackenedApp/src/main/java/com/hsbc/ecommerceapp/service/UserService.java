package com.hsbc.ecommerceapp.service;

import com.hsbc.ecommerceapp.model.User;

public interface UserService {
    void registerUser(User user);
    User loginUser(String username, String password);
    User getUserById(String userId);
}

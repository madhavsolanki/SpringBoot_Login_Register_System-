package com.example.service;

import com.example.dto.UserDto;
import com.example.entities.User;

import java.util.List;

public interface UserService {

    void  saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}

package com.kqyang.springcloud.user.controller;

import com.kqyang.springcloud.user.dao.UserRepository;
import com.kqyang.springcloud.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kayang on 2019/8/20
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }
}
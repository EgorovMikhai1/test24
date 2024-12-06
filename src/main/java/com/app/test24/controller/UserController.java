package com.app.test24.controller;

import com.app.test24.entity.User;
import com.app.test24.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;

    // почему так работает странно?
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(name = "id") int id) {
        return userService.getUserById(id);
    }
}
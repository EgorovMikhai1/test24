package com.app.test24.service.impl;

import com.app.test24.entity.User;
import com.app.test24.exception.UserDoesntExistException;
import com.app.test24.exception.error_messages.ErrorMessage;
import com.app.test24.repository.UserRepository;
import com.app.test24.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            throw new UserDoesntExistException(ErrorMessage.USER_NOT_EXIST);
        }
        System.out.println("User: " + optionalUser.get());
        User user = optionalUser.get();
        return user;
    }

    public String get(int a, int b) {

        int r1 = a + b;
        int r2 = check1(a, b);

        return "" + r1 + r2;
    }

    private int check1(int a, int b) {
        return a + b;
    }
}
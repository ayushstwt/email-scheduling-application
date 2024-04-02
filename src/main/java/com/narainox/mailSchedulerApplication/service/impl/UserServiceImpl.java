package com.narainox.mailSchedulerApplication.service.impl;

import com.narainox.mailSchedulerApplication.model.User;
import com.narainox.mailSchedulerApplication.repository.UserRepository;
import com.narainox.mailSchedulerApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}

package com.thoughtworks.epic.service;

import com.thoughtworks.epic.domain.User;
import com.thoughtworks.epic.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String name){
        return userMapper.getUser(name);
    }


}

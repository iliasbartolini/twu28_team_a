package example.scam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.scam.domain.User;
import example.scam.persistence.UserMapper;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String name){
        return userMapper.getUser(name);
    }


}

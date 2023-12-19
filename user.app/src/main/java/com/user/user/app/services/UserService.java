package com.user.user.app.services;

import com.user.user.app.UserRepository;
import com.user.user.app.models.User;
import com.user.user.app.models.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserRepository userRepository;

    public void createUser(UserDto userDto){

        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
    }
}

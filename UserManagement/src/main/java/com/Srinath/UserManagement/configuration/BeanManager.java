package com.Srinath.UserManagement.configuration;


import com.Srinath.UserManagement.entity.Type;
import com.Srinath.UserManagement.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<User> getUserList(){
        User initUser = new User(0,"srinath","srinath123","srinath@gmail.com","abcd","123456789", Type.ADMIN);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}


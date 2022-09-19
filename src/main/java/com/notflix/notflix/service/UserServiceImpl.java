package com.notflix.notflix.service;

import com.notflix.notflix.models.AdminUser;
import com.notflix.notflix.models.Movie;
import com.notflix.notflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AdminUser> getUsers() {
        return (List<AdminUser>) userRepository.findAll();
    }

    @Override
    public AdminUser create (AdminUser adminUser){return userRepository.save(adminUser);}

    @Override
    public AdminUser checkValidUser(AdminUser adminUser) {
        Iterable<AdminUser> users = userRepository.findAll();

        for (AdminUser user : users) {
            if(user.getUserName().equals(adminUser.getUserName())&&
                    user.getPassword().equals(adminUser.getPassword())){
                System.out.println("inside checkValidUser");
                return user;
            }
        }
        return null;
    }
}

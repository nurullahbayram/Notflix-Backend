package com.notflix.notflix.controller;


import com.notflix.notflix.models.AdminUser;
import com.notflix.notflix.models.Movie;
import com.notflix.notflix.service.MovieServiceImpl;
import com.notflix.notflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/alluser")
    @ResponseBody
    public List<AdminUser> getUsers() {return userService.getUsers();}

    @PostMapping("/admin")
    public boolean createMovie(@RequestBody AdminUser adminUser) {
        System.out.println("Inside getUserCredentials");
        AdminUser validUser = userService.checkValidUser(adminUser);

        if(validUser==null){
            return false;
        }
        return true;
    }

}

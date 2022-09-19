package com.notflix.notflix.service;

import com.notflix.notflix.models.AdminUser;

import java.util.List;

public interface UserService {

    List<AdminUser> getUsers();

    AdminUser create (AdminUser adminUser);

    AdminUser checkValidUser(AdminUser adminUser);
}

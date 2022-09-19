package com.notflix.notflix.repository;

import com.notflix.notflix.models.AdminUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AdminUser,Integer> {
}

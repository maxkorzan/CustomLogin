package com.example.customlogin;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    //4.06 IMPLEMENTING USER REGISTRATION
    User findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String username);

}

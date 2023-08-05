package com.learning.jwt.repository;

import com.learning.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//    org.springframework.security.core.userdetails.User findByUsername(String username);
    User findByUsername(String username);
}

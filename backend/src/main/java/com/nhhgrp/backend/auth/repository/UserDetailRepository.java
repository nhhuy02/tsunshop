package com.nhhgrp.backend.auth.repository;

import com.nhhgrp.backend.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<User,Long> {
    User findByEmail(String username);
}

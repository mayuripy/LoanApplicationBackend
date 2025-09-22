package com.sit.homeloan.repository;

import com.sit.homeloan.model.User;
import com.sit.homeloan.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    boolean existsByRole(Role role);  
}
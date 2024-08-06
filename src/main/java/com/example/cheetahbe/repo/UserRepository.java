package com.example.cheetahbe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cheetahbe.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

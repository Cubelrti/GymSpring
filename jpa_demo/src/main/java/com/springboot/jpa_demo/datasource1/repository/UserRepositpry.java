package com.springboot.jpa_demo.datasource1.repository;

import com.springboot.jpa_demo.datasource1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositpry extends JpaRepository<User,Integer> {
    public User findById(Long id);
}

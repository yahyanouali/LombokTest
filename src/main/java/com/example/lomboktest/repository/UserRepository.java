package com.example.lomboktest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lomboktest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.example.SpringBootPostgres.data.repository;

import com.example.SpringBootPostgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

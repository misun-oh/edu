package com.example.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUsername(String username);
}

package com.example.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {

}

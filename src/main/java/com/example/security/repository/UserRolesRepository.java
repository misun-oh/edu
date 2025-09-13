package com.example.security.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.entity.UserRoles;

public interface UserRolesRepository extends JpaRepository<UserRoles, Integer>{

}

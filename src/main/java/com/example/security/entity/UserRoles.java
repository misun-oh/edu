package com.example.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserRoles {
	@Id
	private Integer id;
	@Id
	private Integer role_id;
}

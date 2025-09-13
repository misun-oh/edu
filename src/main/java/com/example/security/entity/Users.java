package com.example.security.entity;

import java.util.List;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 6, nullable = false)
	private Integer id;
	@Column(length = 20, nullable = false, unique = true)
	private String username;
	@Column(length = 60, nullable = false)
	private String password;
	
}


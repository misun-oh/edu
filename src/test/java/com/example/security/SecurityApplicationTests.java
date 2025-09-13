package com.example.security;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;

import com.example.security.entity.Roles;
import com.example.security.entity.Users;
import com.example.security.repository.RoleRepository;
import com.example.security.repository.UserRepository;
import com.example.security.repository.UserRolesRepository;

@SpringBootTest
class SecurityApplicationTests {
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserRolesRepository urRepository;
	
	@Test
	void insert() {
		Users u = userRepository.save(new Users(null,"user",encoder.encode("1234")));
		Users a = userRepository.save(new Users(null,"admin",encoder.encode("1234")));
		Roles u_role = roleRepository.save(new Roles(null,"USER"));
		Roles a_role = roleRepository.save(new Roles(null,"ADMIN"));
		
	}
	
	@Test
	void findByUsername() {
		System.out.println("test");
		Users u = userRepository.findByUsername("user1")
			.orElseThrow();
		System.out.println("test");
		System.out.println(u);
	}
	@Test
	void contextLoads() {
		String encode = encoder.encode("1234");
		System.out.println(encode);
		Boolean res = encoder.matches("1234", encode);
		System.out.println(res);
	}

}

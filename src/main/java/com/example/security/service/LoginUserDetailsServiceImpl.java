package com.example.security.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.entity.LoginUser;
import com.example.security.entity.Users;
import com.example.security.repository.UserRepository;

@Service
public class LoginUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("username : " + username);
		Users u = userRepository
					.findByUsername(username)
					.orElseThrow(()-> new UsernameNotFoundException(username));
		
		System.out.println(u+ "=============");
		// DB에서 사용자 정보를 조회 하여 객체를 생성
		return new LoginUser(u.getUsername(),
					u.getPassword(),
					Collections.emptyList());
	}
	
	

}

package com.greatlearning.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagement.entity.User;
import com.greatlearning.studentmanagement.repository.UserRepository;
import com.greatlearning.studentmanagement.security.MyCustomUserDetails;

@Repository
public class StudentUserDetailsService
	implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User userEntity = userRepository.getUserByUsername(username);
		
		if (userEntity == null) {
			// Throw exception
			throw new UsernameNotFoundException("Could not find user");
		}
		
		return new MyCustomUserDetails(userEntity);
	}
}

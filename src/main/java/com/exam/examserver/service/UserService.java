package com.exam.examserver.service;

import java.util.Set;

import com.exam.examserver.entity.User;
import com.exam.examserver.entity.UserRole;

public interface UserService {
//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//getting user
	public User getUser(String username);

	//delete user by id
	public void deleteUser(Long id);
	
	//save update
	public User saveOrUdate(User user);
}

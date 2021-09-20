package com.exam.examserver.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.AsyncHandlerMethodReturnValueHandler;

import com.exam.examserver.entity.Role;
import com.exam.examserver.entity.User;
import com.exam.examserver.entity.UserRole;
import com.exam.examserver.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> userRoles= new HashSet<UserRole>();
		Role role= new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		UserRole userRole= new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoles.add(userRole);
		
		return this.userService.createUser(user, userRoles);
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		this.userService.deleteUser(id);
	}
	
	@PutMapping("/")
	public User saveOrUpdate(@RequestBody User user) {
		userService.saveOrUdate(user);
		return user;
	}

}

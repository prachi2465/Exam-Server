package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.entity.Role;
import com.exam.examserver.entity.User;
import com.exam.examserver.entity.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("starting app..");
		/*
		 * User user= new User(); user.setFirstName("Prachi");
		 * user.setLastName("Rajput"); user.setUsername("prachi2465");
		 * user.setEmail("prachi@gmail.com"); user.setPassword("1234");
		 * user.setProfile("default.png");
		 * 
		 * Role role1= new Role(); role1.setRoleId(44L); role1.setRoleName("ADMIN");
		 * 
		 * UserRole userRole= new UserRole(); userRole.setRole(role1);
		 * userRole.setUser(user);
		 * 
		 * Set<UserRole> userRoles= new HashSet<UserRole>(); userRoles.add(userRole);
		 * 
		 * User user2= this.userService.createUser(user, userRoles);
		 * System.out.println(user2.getUsername());
		 * System.out.println(user2.getUserRoles());
		 */	}

}

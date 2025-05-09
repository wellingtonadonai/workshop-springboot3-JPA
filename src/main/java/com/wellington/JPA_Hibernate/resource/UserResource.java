package com.wellington.JPA_Hibernate.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.JPA_Hibernate.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		
		User u = new User(1L, "wellington", "deustremendo123@gmail.com", "992845056", "259431");
		return ResponseEntity.ok().body(u);
		
	}

}

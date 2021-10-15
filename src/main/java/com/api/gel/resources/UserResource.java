package com.api.gel.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gel.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User>fidall(){
		User u = new User(1L, "Tarcisio da Paixão dos Santos", "tarcisio.santostj@hotmail.com", "79 999665593", "98661559");
		return ResponseEntity.ok().body(u);
	}
}

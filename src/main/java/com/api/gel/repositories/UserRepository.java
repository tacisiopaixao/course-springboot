package com.api.gel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gel.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

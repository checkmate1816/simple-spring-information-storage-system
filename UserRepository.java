package com.zrz.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zrz.spring.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	//sort by lastname
		public List<User> findAllByOrderByLastNameAsc();
}

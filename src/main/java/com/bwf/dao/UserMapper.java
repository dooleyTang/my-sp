package com.bwf.dao;

import java.util.List;

import com.bwf.entity.User;

public interface UserMapper {
	User getUserById(int Id);
	
	void add(User user);
	List<User> getUserByGender(String gender );
}

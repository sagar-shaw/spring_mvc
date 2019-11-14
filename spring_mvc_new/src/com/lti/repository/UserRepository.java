package com.lti.repository;

import java.util.List;

import com.lti.model.User;

public interface UserRepository {

	public User addUser();
	public void updateUser(User u);
	public void deleteUser(User u);
	public User findUserById(int id);
	public List<User> findAllUsers();
	public User findUserByEmail(String email);
}

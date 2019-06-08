package com.service;

import java.util.List;

import com.model.User;

/**
 * @author sreekanth
 *
 */
public interface UserService {

	User save(User user);

	List<User> findAll();

	void delete(long id);
}

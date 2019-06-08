package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

/**
 * @author sreekanth
 *
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User findByUsername(String username);
}

package com.nagarro.training.dao;

import java.util.List;

import com.nagarro.training.entity.User;

/**
 * UserDao Interface
 * @author mohammadirshad
 *
 */

public interface UserDao {
	
	//register user
	public void addUser(User user);
	
	//get user
	public List<User> getAllUser();
	
	//recharge service
	public void addAmount(String custKey, int amountToAdd);
	
	//Search service
	public List<User> getUserByNEC(String name,String email,String contact);
	
	public User getById(String id);
	
	public User getBlocked(String id,String bamt);
	
	public void updateAmount(String key, String updateAmount);
	
	

}

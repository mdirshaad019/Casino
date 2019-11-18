package com.nagarro.training.service;
/**
 * ROulette Service INterface
 * @author mohammadirshad
 *
 */
public interface RouletteService {
	
	public String getUserById(String id);
	
	public void updateUserAmount(String id,String amt);
	
	public String setBlockedAmount(String id,String bamt);

}

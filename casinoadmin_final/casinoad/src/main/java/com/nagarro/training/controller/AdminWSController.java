package com.nagarro.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nagarro.training.service.AdminService;

/**
 * Api Controller
 * @author mohammadirshad
 *
 */

@RestController
public class AdminWSController {

	@Autowired
	AdminService adminService;
	/**
	 * Get User By id Api
	 * @param id
	 * @return
	 * @throws JsonProcessingException
	 */
	@GetMapping("/api/admin/get/{id}")
	public String adminGetApi(@PathVariable("id") String id) throws JsonProcessingException {
		ObjectMapper obj = new ObjectMapper();
		String jsonString = obj.writeValueAsString(adminService.getUserToRoulette(id));
		return jsonString;
	}
	
	/**
	 * Update user amount
	 * @param id
	 * @param amount
	 */

	@GetMapping("api/admin/updateAmount/{id}/{amt}")
	public void adminUpdateAmountApi(@PathVariable("id") String id, @PathVariable("amt") String amount) {
		adminService.updateUserAmt(id, amount);
	}
	/**
	 * Update user blocked amount
	 * 
	 * @param id
	 * @param bamount
	 * @return
	 * @throws JsonProcessingException
	 */
	@GetMapping("api/admin/updateBlockedAmount/{id}/{bamt}")
	public String getAndUpdateBlockedAmount(@PathVariable("id") String id, @PathVariable("bamt") String bamount) throws JsonProcessingException{
		ObjectMapper obj = new ObjectMapper();
		String jsonString = obj.writeValueAsString(adminService.updateUserBlockedAmt(id, bamount));
		
		return jsonString;
	}

}

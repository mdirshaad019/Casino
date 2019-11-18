package com.nagarro.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.service.RouletteServiceImpl;
/**
 * Roulette Controller 
 * @author mohammadirshad
 *
 */
@RestController
@CrossOrigin("*")
public class RouletteController {
	

	
	@Autowired
	RouletteServiceImpl rouletteService;
	
	@GetMapping("/api/user/get/{id}")
	public String getUserById(@PathVariable("id") String id){
		return rouletteService.getUserById(id);
		
	}
	
	@GetMapping("/api/user/get/{id}/{amt}")
	public void updateAmount(@PathVariable("id") String id,@PathVariable("amt") String amount){
		rouletteService.updateUserAmount(id, amount);
	}
	@CrossOrigin("*")
	@GetMapping("api/user/getbetamt/{id}/{bamt}")
	public String updateblockedamt(@PathVariable("id") String id,@PathVariable("bamt") String bamount){
		return rouletteService.setBlockedAmount(id, bamount);
	}

}
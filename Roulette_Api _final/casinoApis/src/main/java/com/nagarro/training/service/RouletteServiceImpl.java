package com.nagarro.training.service;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.nagarro.training.constants.Constant;
import com.nagarro.training.entity.User;
/**
 * Roulette Service Interface Implementation
 * @author mohammadirshad
 *
 */
@Component
public class RouletteServiceImpl implements RouletteService {
	
	RestTemplate restTemplate = new RestTemplate();

	public String getUserById(String id) {
		String uri = Constant.ADMIN_GET_API + id;
		ObjectMapper obj = new ObjectMapper();
		String jsonStr = "";
		try {
			jsonStr = obj.writeValueAsString(restTemplate.getForObject(uri, User.class));
		} catch (RestClientException | IOException e) {
			e.printStackTrace();
		}
		return jsonStr;

	}

	public void updateUserAmount(String id, String amt) {
		String uri = Constant.ADMIN_UPDATE_AMOUNT_API + id + "/" + amt;
		restTemplate.getForObject(uri, User.class);
	}
	
	public String setBlockedAmount(String id,String bamt){
		String uri="http://localhost:8081/casinoad/api/admin/updateBlockedAmount/"+id+"/"+bamt;
		ObjectMapper obj = new ObjectMapper();
		String jsonStr = "";
		try {
			jsonStr = obj.writeValueAsString(restTemplate.getForObject(uri, User.class));
		} catch (RestClientException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("blocked amt=========="+jsonStr);
		return jsonStr;
	}

}

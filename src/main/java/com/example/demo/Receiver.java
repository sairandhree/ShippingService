package com.example.demo;



import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);
	
	@Autowired
	UserClient userClient;

	public void receiveMessage(Order order) {
		
		LOGGER.info("Order received.  Payload   is  {}", order.toString());
		
		User userDetails = userClient.getUser(order.getCustomerEmail());

		LOGGER.info("Order shipped to {}", userDetails.getAddress());

		

	}
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
	ObjectMapper objectMapper = new ObjectMapper();

	

}

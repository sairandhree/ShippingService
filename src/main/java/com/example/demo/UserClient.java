package com.example.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "user", url = "http://localhost:8082")
public interface UserClient {
	@GetMapping("/users/{email}")
	User getUser(@PathVariable String email);

}
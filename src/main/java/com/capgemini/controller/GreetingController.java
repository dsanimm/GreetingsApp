package com.capgemini.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.entity.Greeting;
import com.capgemini.entity.User;

import com.capgemini.interfaces.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
	@Autowired
	private IGreetingService greetingService;

	private static final String template = "Hello , %s !";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value = { "", "/", "/home" })
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Stranger") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}

}

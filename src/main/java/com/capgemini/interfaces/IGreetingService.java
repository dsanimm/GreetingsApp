package com.capgemini.interfaces;

import com.capgemini.entity.Greeting;
import com.capgemini.entity.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
}

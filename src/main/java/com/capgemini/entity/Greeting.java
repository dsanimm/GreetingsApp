package com.capgemini.entity;



public class Greeting {
public Greeting(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
long id;
String message;
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}

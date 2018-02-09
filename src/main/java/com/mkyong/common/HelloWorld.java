package com.mkyong.common;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void printHello() {
		System.out.println("Hello " + name);
	}
	
}

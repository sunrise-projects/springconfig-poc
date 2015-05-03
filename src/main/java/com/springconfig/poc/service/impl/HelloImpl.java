package com.springconfig.poc.service.impl;

import com.springconfig.poc.service.Hello;

public class HelloImpl implements Hello {

	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
}

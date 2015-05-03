package com.springconfig.poc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springconfig.poc.config.SpringConfig;
import com.springconfig.poc.service.Hello;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://www.mkyong.com/spring3/spring-3-javaconfig-example/
		//http://www.mkyong.com/maven/how-to-create-a-jar-file-with-maven/
		System.out.println("...");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	    Hello obj = (Hello)context.getBean("helloBean");
	    obj.sayHello("world!");
	    
	    
		
		
	}
}

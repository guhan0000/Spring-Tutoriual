package com.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Laptop bean = context.getBean("laptop",Laptop.class);
		bean.getData();
		
		
		
	}

}

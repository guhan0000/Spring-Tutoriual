package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
			Laptop a = context.getBean("laptop",Laptop.class);
			a.getData();
	}

}

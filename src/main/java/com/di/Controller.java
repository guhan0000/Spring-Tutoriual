package com.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Controller {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Bike bike = context.getBean("bike",Bike.class);
		bike.getData();
	}

}

package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop {
	Mobile mobile;
	HeadPhones headPhones;
	
	public Laptop(Mobile mobile, HeadPhones headPhones)
	{
		this.mobile=mobile;
//		System.out.println("Laptop Construtor Called");
		this.headPhones=headPhones;
	}
	 void getLaptopModel() {
		System.out.println("Hp Pavilion");

	}
	 void getData()
	 {
		 getLaptopModel();
		 mobile.getMobileModel();
		 headPhones.getHeadphoneModel();
		 
		 
	 }
	

}

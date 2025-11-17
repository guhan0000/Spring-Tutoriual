package com.test;
import com.test.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop laptop=context.getBean(Laptop.class);
		laptop.getModel();
//		context.close();
		Mobile mobile=context.getBean(Mobile.class);
		mobile.getData();
		
	}
}

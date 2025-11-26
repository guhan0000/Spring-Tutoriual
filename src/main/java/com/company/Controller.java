package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProjectManager.class);
		Management bean = context.getBean("management",Management.class);
		bean.getDuties();
		
		
	}
	

}

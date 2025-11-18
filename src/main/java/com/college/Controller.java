package com.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeManagement.class);
		CollegeManagement bean = context.getBean(CollegeManagement.class);
		bean.display();
		
	}

}

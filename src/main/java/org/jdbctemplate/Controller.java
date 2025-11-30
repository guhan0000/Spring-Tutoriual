package org.jdbctemplate;

import java.util.*;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template.xml");
		Student bean = context.getBean("student",Student.class);
//		bean.getStudentData();
		Scanner scanner=new Scanner(System.in);
		List<Map<String, Object>> studentData = bean.getStudentData();
//		for(Map<String, Object> student : studentData)
//		{
//			System.out.println(student);
//		}
		System.out.println(studentData);
//		System.out.println("enter sid");
//		int sId=scanner.nextInt();
//		System.out.println(bean.getStudentByDept(sId));
//		bean.getStudentEmail();
		
		
//		System.out.println("enter email");
//		String sEmail=scanner.next();
//		System.out.println(bean.updateStudentEmail(sEmail,sId));
//		scanner.nextLine();
//		System.out.println("enter sName");
//		String sName=scanner.nextLine();
//		
//		System.out.println("enter age");
//		int sAge=scanner.nextInt();
//		System.out.println(bean.insertStudentData(sId, sName, sAge));
		
		
	}

}

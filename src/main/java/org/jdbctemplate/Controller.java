package org.jdbctemplate;

import java.util.*;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	
	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template.xml");
		Student bean = context.getBean("student",Student.class);
		bean.getStudentData();
		
		List<Map<String, Object>> studentData = bean.getStudentData();
		for(Map<String, Object> student : studentData)
		{
			System.out.println(student);
		}
		
	}

}

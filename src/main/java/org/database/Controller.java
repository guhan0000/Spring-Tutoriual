package org.database;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) throws SQLException {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employees bean = context.getBean("employees",Employees.class);
		bean.getEmpData();
		

	}

}

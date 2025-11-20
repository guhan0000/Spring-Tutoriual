package org.database;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) throws SQLException {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employees bean = context.getBean("employees",Employees.class);
		
//		Scanner scanner = context.getBean("scanner",Scanner.class);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter EmpId");
		int empId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter EmpName");
		String empName=scanner.nextLine();
		System.out.println("enter EmpAge");
		int empAge=scanner.nextInt();
		System.out.println("enter EmpDept");
		String empDept=scanner.next();
		bean.setEmpData(empId, empName, empAge, empDept);
		bean.getEmpData();
		

	}

}

package org.database;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	

	

	public static void main(String[] args) throws SQLException {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employees bean = context.getBean("employees",Employees.class);
		
		Scanner bean2 = context.getBean("scanner",Scanner.class);
		
//		Scanner scanner=new Scanner(System.in);
		System.out.println("enter EmpId");
		int empId=bean2.nextInt();
		System.out.println("enter salary incremet");
		double empIncrement=bean2.nextDouble();
		bean.updateSalary(empId, empIncrement);
//		bean2.nextLine();
//		System.out.println("enter EmpName");
//		String empName=bean2.nextLine();
//		System.out.println("enter EmpAge");
//		int empAge=bean2.nextInt();
//		System.out.println("enter EmpDept");
//		String empDept=bean2.next();
//		bean.setEmpData(empId, empName, empAge, empDept);
//		bean.getEmpData();
//		bean.removeEmp(empId);
		
		

	}

}

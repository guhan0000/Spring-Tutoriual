package org.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String pwd="guhan69";
			String querString="select * from employees";
			Connection connection=DriverManager.getConnection(url,user,pwd);
			Statement statement = connection.createStatement();
			ResultSet executeQuery = statement.executeQuery(querString);
			while (executeQuery.next()) {
				System.out.println("Employee_Id "+executeQuery.getString(1) + executeQuery.getString(2));
			}
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}

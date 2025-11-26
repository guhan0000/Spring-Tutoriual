package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Employees {
	
	
	DataSource dataSource;
	Connection connection;
	
//	DriverManagerDataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
		
	}
	
	
		 void setEmpData(int empId,String empName,int empAge,String empDept) throws SQLException {
			String sql="INSERT INTO employees (id,name,age,department) VALUES (?,?,?,?)";
			Connection connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, empId);
			statement.setString(2, empName);
			statement.setInt(3, empAge);
			statement.setString(4, empDept);
			int executeUpdate = statement.executeUpdate();
			if(executeUpdate==1){
				System.out.println("employee created successfully");
			}
			else {
				System.out.println("employee not created");
			}
		}
		 double getSalary(int EmpId) throws SQLException
		 {
			 String sql="SELECT salary from employees WHERE id = ?";
			 Connection connection=dataSource.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql);
			 statement.setInt(1, EmpId);
			 ResultSet resultSet = statement.executeQuery();	
			 if(resultSet.next())
			 {
				 double empSalary = resultSet.getDouble("salary");
				 return empSalary;
			 }
			 return 0.0;
			 
			 
			 
			 
			 
		 }
	
		
		void getEmpData() throws SQLException {
			
			String sql = "SELECT * FROM employees";
			
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Id\tName\t\tAge\tDept");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));
				
			}
			
			
		}
		void removeEmp(int empId) throws SQLException{
			String sql="DELETE FROM employees WHERE id=?";
			connection=dataSource.getConnection();
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setInt(1, empId);
			int executeUpdate = statement.executeUpdate();
			if(executeUpdate==1)
			{
				System.out.println(executeUpdate+ "employee deleted successfully");
			}
			else {
				System.out.println(executeUpdate+"Employee not deleted");
			}
			
		}
		void updateSalary(int empId,double empIncrement) throws SQLException {
			
			String sql="UPDATE employees SET salary=? WHERE id=?";
			connection=dataSource.getConnection();
			PreparedStatement statement=connection.prepareStatement(sql);
			
			statement.setDouble(1, empIncrement+getSalary(empId));
			statement.setInt(2, empId);
			int executeUpdate = statement.executeUpdate();
			if(executeUpdate==1){
				System.out.println("increment added");
			}
			else {
				System.out.println("increment not updated");
			}
			
			
		}

		

}

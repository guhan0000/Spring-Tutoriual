package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Employees {
	DataSource dataSource;
//	DriverManagerDataSource
	
	
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


		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			
			
		}

}

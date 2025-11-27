package org.pojo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


@Component
public class CustomerDbConnection {
	
	@Autowired
	DataSource dataSource;
	
	
	
	 List<Customers> getCustomerData() throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM customers";
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		List <Customers>list=new ArrayList<>();
		while(resultSet.next())
		{
//			list.add(resultSet.getInt(1));
//			list.add(resultSet.getString(2));
//			list.add(resultSet.getString(3));
//			list.add(resultSet.getString(4));
//			list.add(resultSet.getString(5));
			list.add(new Customers(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));
			
		}
		return list;
		

	}
	

}

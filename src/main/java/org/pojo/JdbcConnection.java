package org.pojo;
import java.util.*;
import java.sql.*;
public class JdbcConnection {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List list=new ArrayList<>();
		Set set=new LinkedHashSet<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","guhan69");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
		while(resultSet.next())
		{
//			System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
//			list.add(resultSet.getString(1));
//			list.add(resultSet.getString(2));
//			list.add(resultSet.getString(1));
			set.add(resultSet.getString(1));
			set.add(resultSet.getString(2));
			set.add(resultSet.getString(1));
			set.add(resultSet.getString(3));
			set.add(resultSet.getString(4));
		}
//		System.out.println(set);
		for(Object object:set)
		{
			System.out.println(object);
		}
		connection.close();
		
	}

}

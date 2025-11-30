package org.pojo;
import java.util.*;
import java.sql.*;
public class JdbcConnection {
	
	static Products products;
	static {
		products=new Products();
	}
	
	public static  List<Products> getData() throws ClassNotFoundException, SQLException {
		List list=new ArrayList<>();
//		Set set=new LinkedHashSet<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","guhan69");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
		while(resultSet.next()){
//			list.add(resultSet.getString(1));
//			list.add(resultSet.getString(2));
//			list.add(resultSet.getString(3));
			list.add(new Products(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));
		}
		connection.close();
		return list;
		
		
	}

}

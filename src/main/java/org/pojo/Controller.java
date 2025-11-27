package org.pojo;

import java.sql.SQLException;
import java.util.List;

public class Controller extends JdbcConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JdbcConnection jdbcConnection=new JdbcConnection();
		List<Products> data = jdbcConnection.getData();
		for(Products products:data)
		{
			System.out.println(products.getProductId()+"\t"+products.getProductName());
		}
		
	}

}

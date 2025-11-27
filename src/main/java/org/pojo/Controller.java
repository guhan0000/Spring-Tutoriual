package org.pojo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("pojo_bean.xml");
		CustomerDbConnection bean = context.getBean(CustomerDbConnection.class);
		List <Customers>customerData = bean.getCustomerData();
//		System.out.println(customerData);
		for(Customers customers:customerData)
		{
			System.out.println(customers.getCustName());
		}
		
		
		
//		
	}

}

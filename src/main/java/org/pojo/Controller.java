package org.pojo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("orders.xml");
		OrdersDbConnection bean = context.getBean(OrdersDbConnection.class);
//		List<Map<String, Object>> orderData = bean.getOrderData();
//		System.out.println(bean.getOrderData());
		List<Orders> orderData = bean.getOrderData();
		for(Orders order:orderData)
		{
			System.out.println(order.getOrdId()+" "+order.getCustName()+" "+order.getProdName());
		}
		
		
//		
	}

}

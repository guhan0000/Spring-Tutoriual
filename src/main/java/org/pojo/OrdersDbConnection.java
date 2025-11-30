package org.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class OrdersDbConnection {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	 List getOrderData() {
		 List<Orders>list=new ArrayList();
		 List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("SELECT * FROM orders");
		 for(Map<String, Object> data:queryForList) {
//			 System.out.println(data.get("customer_name
//			 list.add(data.get("order_id"));
//			 list.add(data.get("order_date"));
			 int oId=(int)data.get("order_id");
//			 list.add(oId);
//			 String oDate=(String)data.get("order_date");
			 String custName=(String)data.get("customer_name");
			 String prodName=(String)data.get("product_name");
			 Orders orders=new Orders();
			 orders.setCustName(custName);
			 orders.setProdName(prodName);
			 orders.setOrdId(oId);
			 list.add(orders);
//			 list.add(orders.setOrdId(oId));
//			 list.add(oDate);
//			 list.add(custName);
//			 list.add(prodName);
//			 
			
			 
		 }
	return list;	 
	}
	 
	

}

package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Management {
	@Autowired
	@Qualifier("projectManager")
	Manager manager1;
	
	
	@Autowired
	@Qualifier("productManager")
	Manager manager2;
	
	
	void getDuties()
	{
		System.out.println(manager2.lead());
		System.out.println(manager2.monitor());
	}

}

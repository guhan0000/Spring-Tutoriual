package com.company;

import org.springframework.stereotype.Component;

@Component
public class ProductManager implements Manager {

	@Override
	public String lead() {
		// TODO Auto-generated method stub
		return "Leading Product";
	}

	@Override
	public String monitor() {
		// TODO Auto-generated method stub
		return "Monitoring Product";
	}

}

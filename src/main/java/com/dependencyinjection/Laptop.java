package com.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	@Autowired
	Mobile mobile;
	
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}
	void lapModel()
	{
		System.out.println("hp");
	}
	void getData()
	{
		mobile.mobileModel();
		lapModel();
		
	}

}

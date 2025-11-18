package com.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan(basePackages = "com.college")
public class CollegeManagement {

	@Autowired
	EceDept eceDept;
	@Autowired
	CseDept cseDept;
	@Autowired
	Mech_Dept mech_Dept;
	
	void display()
	{
		
		System.out.println("College Management");
		System.out.println("total students " + (eceDept.eceCount+cseDept.cseCount+mech_Dept.mechCount ));
	}

}

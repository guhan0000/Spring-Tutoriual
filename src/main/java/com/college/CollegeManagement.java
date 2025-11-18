package com.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan(basePackages = "com.college")
public class CollegeManagement {
	EceDept eceDept;
	CseDept cseDept;
	Mech_Dept mech_Dept;
	@Autowired
	public CollegeManagement(EceDept ece,CseDept cse,Mech_Dept mech)
	{
		eceDept=ece;
		cseDept=cse;
		mech_Dept=mech;
	}
	
	void display()
	{
		
		System.out.println("College Management");
		System.out.println("total students " + (eceDept.eceCount+cseDept.cseCount+mech_Dept.mechCount ));
	}

}

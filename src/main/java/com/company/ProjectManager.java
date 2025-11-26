package com.company;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan(basePackages  = "com.company")
@Component
public class ProjectManager implements Manager {

	@Override
	public String lead() {
		// TODO Auto-generated method stub
		return "Leading Projects";
	}

	@Override
	public String monitor() {
		// TODO Auto-generated method stub
		return "Monitoring Project Team";
	}

}

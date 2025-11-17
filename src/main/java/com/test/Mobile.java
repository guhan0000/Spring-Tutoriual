package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	Processor processor;
	@Autowired
	public Mobile(Processor processor){
		this.processor=processor;
	}
	
	void getData()
	{
		processor.getProcessor();
	}

}

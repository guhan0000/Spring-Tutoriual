package com.di;

public class Bike {
	Engine engine;
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	void getBikeDetail()
	{
		System.out.println("Bajaj");
	}
	void getData()
	{
		getBikeDetail();
		engine.getEngineDetails();
	}
}

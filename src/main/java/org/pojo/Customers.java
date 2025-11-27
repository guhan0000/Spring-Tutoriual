package org.pojo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Customers {
	private int custId;
	public Customers() {}
	public Customers(int custId, String custName, String custPhone, String custCity, String custStatus) {
		
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custCity = custCity;
		this.custStatus = custStatus;
	}
	private String custName;
	private String custPhone;
	private String custCity;
	private String custStatus;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	

}

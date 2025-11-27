package org.pojo;
// Plain Old Java Object
public class Products {
	private String productId;
	private String productName;
	private String category;
	private String price;
	private String stock;
	
	public Products(String productId, String productName, String category, String price, String stock) {
		
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

}

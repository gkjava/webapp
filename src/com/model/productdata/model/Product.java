package com.model.productdata.model;

public class Product {

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	private String name ;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

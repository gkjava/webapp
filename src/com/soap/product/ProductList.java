package com.soap.product;

import java.io.Serializable;
import java.util.List;

public class ProductList implements Serializable{

	private static final long serialVersionUID = -9211460562247225003L;
	private List<String> productList;
	public List<String> getProductList() {
		return productList;
	}
	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
}

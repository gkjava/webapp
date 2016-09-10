package com.soap.product;

import javax.xml.ws.Endpoint;


public class WebServicelauncher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5656/getInfo", new CountryCatalogImpl());
	}
}

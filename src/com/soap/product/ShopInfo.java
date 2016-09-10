package com.soap.product;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupResponse")
	public String getShopInfo(@WebParam(partName="lookupInput") String name) {
		return "Since 1920";
	}
}

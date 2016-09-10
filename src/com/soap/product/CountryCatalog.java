package com.soap.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.xml.sax.SAXException;

import com.model.productdata.model.Product;

@WebService(name = "CountryCatalogDelegate",targetNamespace = "http://www.gkjava.com")
public interface CountryCatalog {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCountyList()
	 */
	@WebMethod(operationName = "getCountyList", action = "urn:GetCountry")
	@WebResult(name = "country", header = false)
	public abstract List<String> getCountyList() throws SoapFaultException,
			SAXException, IOException;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCurrencies()
	 */
	@WebMethod(operationName = "getCurrencies", action = "urn:GetCurrencies")
	@WebResult(name = "getCurrencies", header = false)
	public abstract List<String> getCurrencies();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCountryByCountryCode(java.lang.String)
	 */
	@WebMethod(operationName = "getCountryByCountryCode", action = "urn:GetCountryByCountryCode")
	@WebResult(name = "getCountryByCountryCode", header = false)
	public abstract String getCountryByCountryCode(String countryCode);

	@WebMethod(operationName = "getCountryByCurrencyCode", action = "urn:getCountryByCurrencyCode")
	@WebResult(name = "getCountryByCurrencyCode", header = false)
	public abstract String getCountryByCurrencyCode(String currencyCode);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyByCountry(java.lang.String)
	 */
	@WebMethod(operationName = "getCurrencyByCountry", action = "urn:GetCurrencyByCountry")
	@WebResult(name = "getCurrencyByCountry", header = false)
	public abstract String getCurrencyByCountry(String country);

	@WebMethod(operationName = "getCurrencyCode", action = "urn:GetCurrencyCode")
	@WebResult(name = "getCurrencyCode", header = false)
	public abstract String getCurrencyCode();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyCodeByCurrencyName(java.lang
	 * .String)
	 */
	@WebMethod(operationName = "getCurrencyCodeByCurrencyName", action = "urn:GetCurrencyCodeByCurrencyName")
	@WebResult(name = "getCurrencyCodeByCurrencyName", header = false)
	public abstract String getCurrencyCodeByCurrencyName(String currencyName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getGMTbyCountry(java.lang.String)
	 */
	@WebMethod(operationName = "getGMTbyCountry", action = "urn:GetGMTbyCountry")
	@WebResult(name = "getGMTbyCountry", header = false)
	public abstract String getGMTbyCountry(String country);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getISD(java.lang.String)
	 */
	@WebMethod(operationName = "getISD", action = "urn:GetISD")
	@WebResult(name = "getISD", header = false)
	public abstract String getISD(String countryName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getISOCountryCodeByCountyName(java.lang
	 * .String)
	 */
	@WebMethod(operationName = "getISOCountryCodeByCountyName", action = "urn:GetISOCountryCodeByCountyName")
	@WebResult(name = "getISOCountryCodeByCountyName", header = false)
	public abstract String getISOCountryCodeByCountyName(String countryName);
	
	/**
	 * @param name
	 * @return
	 */
	@WebMethod(operationName = "getProductInfo", action = "urn:GetProductInfo")
	@WebResult(name = "getProductInfo", header = false)
	public List<Product> getProductInfo(String name);
	

}
package com.soap.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.xml.sax.SAXException;

import com.model.productdata.CountryProcess;
import com.model.productdata.CountryProcessImpl;
import com.model.productdata.model.Product;

/**
 * @author Gaurav
 * 
 */
@WebService(endpointInterface="com.soap.product.CountryCatalog",  portName = "CountryCatalogPort", serviceName = "CountryCatalogService")
public class CountryCatalogImpl implements CountryCatalog {

	@Inject
	@Named(value="countryProcess")
	CountryProcess countryProcess;
	//= new CountryProcessImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCountyList()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCountyList()
	 */
	@Override
	public List<String> getCountyList() throws SoapFaultException,
			SAXException, IOException {
		return countryProcess.getCountyList();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCurrencies()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCurrencies()
	 */
	@Override
	public List<String> getCurrencies() {
		return countryProcess.getCurrencies();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCountryByCountryCode(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCountryByCountryCode(java.lang.String)
	 */
	@Override
	public String getCountryByCountryCode(String countryCode) {
		return countryProcess.getCountryByCountryCode(countryCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCountryByCurrencyCode(java.lang.String
	 * )
	 */
	@Override
	public String getCountryByCurrencyCode(String currencyCode) {
		return countryProcess.getCountryByCurrencyCode(currencyCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyByCountry(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyByCountry(java.lang.String)
	 */
	@Override
	public String getCurrencyByCountry(String country) {
		return countryProcess.getCurrencyByCountry(country);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getCurrencyCode()
	 */
	@Override
	public String getCurrencyCode() {
		return countryProcess.getCurrencyCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyCodeByCurrencyName(java.lang
	 * .String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getCurrencyCodeByCurrencyName(java.lang
	 * .String)
	 */
	@Override
	public String getCurrencyCodeByCurrencyName(String currencyName) {
		return countryProcess.getCurrencyCodeByCurrencyName(currencyName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getGMTbyCountry(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getGMTbyCountry(java.lang.String)
	 */
	@Override
	public String getGMTbyCountry(String country) {
		return countryProcess.getGMTbyCountry(country);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getISD(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.soap.product.CountryCatalog#getISD(java.lang.String)
	 */
	@Override
	public String getISD(String countryName) {
		return countryProcess.getISD(countryName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getISOCountryCodeByCountyName(java.lang
	 * .String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.soap.product.CountryCatalog#getISOCountryCodeByCountyName(java.lang
	 * .String)
	 */
	@Override
	public String getISOCountryCodeByCountyName(String countryName) {
		return countryProcess.getISOCountryCodeByCountyName(countryName);
	}
	
	public List<Product> getProductInfo(String name) {
		List<Product> produList = new ArrayList<Product>();
			
			return produList;
		
		
	}

}

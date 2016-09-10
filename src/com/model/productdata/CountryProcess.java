package com.model.productdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import com.soap.product.ProductList;
import com.soap.product.SoapFaultException;

/**
 * @author Gaurav
 *
 */
public interface CountryProcess {

	/**
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 */
	List<String> getCountyList() throws SAXException, IOException;

	/**
	 * @return
	 */
	List<String> getCurrencies();

	/**
	 * @param countryCode
	 * @return
	 */
	String getCountryByCountryCode(String countryCode);

	/**
	 * @param currencyCode
	 * @return
	 */
	String getCountryByCurrencyCode(String currencyCode);

	/**
	 * @param country
	 * @return
	 */
	String getCurrencyByCountry(String country);

	/**
	 * @return
	 */
	String getCurrencyCode();

	/**
	 * @param currencyName
	 * @return
	 */
	String getCurrencyCodeByCurrencyName(String currencyName);

	/**
	 * @param country
	 * @return
	 */
	String getGMTbyCountry(String country);

	/**
	 * @param countryName
	 * @return
	 */
	String getISD(String countryName);

	/**s
	 * @param countryName
	 * @return
	 */
	String getISOCountryCodeByCountyName(String countryName);

}

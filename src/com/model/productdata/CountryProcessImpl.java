package com.model.productdata;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.webservicex.Country;
import net.webservicex.CountrySoap;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.soap.product.ProductList;
import com.soap.product.SoapFaultException;

/**
 * @author Gaurav
 *
 */
@Component
@Named
public class CountryProcessImpl implements CountryProcess {

	CountrySoap soapClient;

	public CountryProcessImpl() {
		Country country = new Country();
		this.soapClient = country.getCountrySoap();

	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCountyList()
	 */
	@Override
	public List<String> getCountyList() throws SAXException, IOException {

		List<String> countryList = new ArrayList<String>();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		}
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(this.soapClient.getCountries()));
		Document doc = dBuilder.parse(is);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("Table");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			Element eElement = (Element) nNode;
			countryList.add(eElement.getElementsByTagName("Name").item(0)
					.getTextContent());
		}
		return countryList;
	}

	/**
	 * @param args
	 * @throws SAXException
	 * @throws IOException
	 */
	public static void main(String[] args) throws SAXException, IOException {
		CountryProcessImpl processImpl = new CountryProcessImpl();
		System.out.println(processImpl.getCountyList());
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCurrencies()
	 */
	@Override
	public List<String> getCurrencies() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCountryByCountryCode(java.lang.String)
	 */
	@Override
	public String getCountryByCountryCode(String countryCode) {
		return this.soapClient.getCountryByCountryCode(countryCode);
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCountryByCurrencyCode(java.lang.String)
	 */
	@Override
	public String getCountryByCurrencyCode(String currencyCode) {
		return this.soapClient.getCountryByCountryCode(currencyCode);
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCurrencyByCountry(java.lang.String)
	 */
	@Override
	public String getCurrencyByCountry(String country) {
		return this.soapClient.getCurrencyByCountry(country);
	}

	@Override
	public String getCurrencyCode() {
		return this.soapClient.getCurrencyCode();
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getCurrencyCodeByCurrencyName(java.lang.String)
	 */
	@Override
	public String getCurrencyCodeByCurrencyName(String currencyName) {
		return this.soapClient.getCurrencyCodeByCurrencyName(currencyName);
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getGMTbyCountry(java.lang.String)
	 */
	@Override
	public String getGMTbyCountry(String country) {
		return this.soapClient.getGMTbyCountry(country);
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getISD(java.lang.String)
	 */
	@Override
	public String getISD(String countryName) {
		return this.soapClient.getISD(countryName);
	}

	/* (non-Javadoc)
	 * @see com.model.productdata.CountryProcess#getISOCountryCodeByCountyName(java.lang.String)
	 */
	@Override
	public String getISOCountryCodeByCountyName(String countryName) {
		return this.soapClient.getISOCountryCodeByCountyName(countryName);
	}

}

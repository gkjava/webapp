package com.soap.product;

import javax.jws.WebService;

import net.webservicex.CountrySoap;

@WebService(endpointInterface="net.webservicex.CountrySoap", serviceName="CountrySoapService", portName="CountrySoapPort")
public class CountrySoapImpl implements CountrySoap {

	@Override
	public String getCountryByCountryCode(String countryCode) {
		return "sample data";
	}

	@Override
	public String getISD(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrencyCodeByCurrencyName(String currencyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getISOCountryCodeByCountyName(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrencyCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountryByCurrencyCode(String currencyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrencyByCountry(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGMTbyCountry(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}

}

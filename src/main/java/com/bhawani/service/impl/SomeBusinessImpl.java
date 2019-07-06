package com.bhawani.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bhawani.repository.DataService;
import com.bhawani.service.SomeBusiness;
import com.bhawani.utils.PropertyValues;
import com.bhawani.utils.ServiceProperties;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 29-Jun-2019
 */
@Service
public class SomeBusinessImpl implements SomeBusiness {
	@Autowired
	private DataService dataService;
	
	/*
	 * @Autowired public void setDataService(DataService dataService) {
	 * this.dataService = dataService; }
	 */
	
	/** The property values. */
	@Autowired
	private PropertyValues propertyValues;
	/*
	 * @Autowired public void setPropertyValues(PropertyValues propertyValues) {
	 * this.propertyValues = propertyValues; }
	 */
	
	@Autowired
    private ServiceProperties serviceProperties;
	
	/*
	 * @Autowired public void setServiceProperties(ServiceProperties
	 * serviceProperties) { this.serviceProperties = serviceProperties; }
	 */
    /**
	 * Get my language
	 */
	public void getMyLanguage(){
		System.out.println("################ SomeBusinessImpl.getMyLanguage() serviceProperties.getLocale() = "
					+ serviceProperties.getLocale());
		String language = null;
		if(null == serviceProperties.getLocale()) {
			language = "en_US";
		} else {
			language =  serviceProperties.getLocale().getLanguage();
		}
        printSomething(language);
    }
	
	/**
	 * Print my language
	 * @param input
	 */
	private void printSomething(String input){
        System.out.println("Your current language is " + input);
    }
	
	@Value("${url}")
	private String url;

	/*
	 * public SomeBusinessImpl() {}
	 * 
	 * public SomeBusinessImpl(DataService dataService) { super(); this.dataService
	 * = dataService; }
	 */
	
	public int findTheGreatestFromAllDataNEW() {
		System.out.println("\n\n*******************  SomeBusinessImpl.findTheGreatestFromAllData() URL : " 
				+ url+"\n\n");
		return 24;
	}
	
	/**
	 * findTheGreatestFromAllData
	 * @return
	 */
	public int findTheGreatestFromAllData() {
		System.out.println("\n\n*******************  SomeBusinessImpl.findTheGreatestFromAllData() URL : " 
				+ url+"\n\n");
		System.out.println("\n\n*******************  SomeBusinessImpl.findTheGreatestFromAllData() PropertyValues URL : " 
				+ propertyValues.getUrl() +"\n\n");
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		getMyLanguage();
		return greatest;
	}
}

package com.bhawani.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bhawani.beans.StudentRegistration;
import com.bhawani.beans.StudentRegistrationReply;
import com.bhawani.service.StudentRegisterService;
import com.bhawani.utils.PropertyValues;
import com.bhawani.utils.ServiceProperties;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 28-Jun-2019
 */
@Service
public class StudentRegisterServiceImpl implements StudentRegisterService {

	/** The property values. */
	@Autowired
	private PropertyValues propertyValues;

	@Autowired
	private ServiceProperties serviceProperties;

	/*
	 * @Autowired public void setServiceProperties(ServiceProperties
	 * serviceProperties) { this.serviceProperties = serviceProperties; }
	 */

	@Value("${url}")
	private String url;

	/**
	 * 
	 * @param studentregd
	 * @return
	 */
	public StudentRegistrationReply registerStudent(StudentRegistration studentregd) {
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		stdregreply.setName(studentregd.getName());
		stdregreply.setAge(studentregd.getAge());
		stdregreply.setRegistrationNumber("12345678");
		stdregreply.setRegistrationStatus("Successful");
		System.out.println("\n\n *************  StudentRegisterServiceImpl.registerStudent() url: " + url);
		stdregreply.setUrl(url);
		getMyLanguage();
		return stdregreply;
	}

	/**
	 * Get my language
	 */
	public void getMyLanguage() {
		String language = serviceProperties.getLocale().getLanguage();
		printSomething(language);
	}

	/**
	 * Print my language
	 * 
	 * @param input
	 */
	private void printSomething(String input) {
		System.out.print("Your current language is " + input);
	}
}

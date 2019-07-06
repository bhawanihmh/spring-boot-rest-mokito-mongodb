/**
 * 
 * 
 */
package com.bhawani.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 29-Jun-2019
 */
@Service
@ConfigurationProperties(prefix = "myapp")
public class MyConfigProperties {
	private String someProperty;

	public String getSomeProperty() {
		return someProperty;
	}

	public void setSomeProperty(String someProperty) {
		this.someProperty = someProperty;
	}
}

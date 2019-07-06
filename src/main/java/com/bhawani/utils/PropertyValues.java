
package com.bhawani.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 28-Jun-2019
 */
@Component
public class PropertyValues {
	
	/** The service url. */
	@Value("${url}")
	private String url;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}

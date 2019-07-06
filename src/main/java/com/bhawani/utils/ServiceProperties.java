/**
 * 
 * 
 */
package com.bhawani.utils;

import java.util.Locale;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 29-Jun-2019
 */

@Component
@ConfigurationProperties(prefix = "conversation")
public class ServiceProperties {

	private ServiceProperties() {
	};

	private Locale locale;

	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	
}

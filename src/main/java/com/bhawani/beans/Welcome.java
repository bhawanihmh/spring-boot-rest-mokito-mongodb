package com.bhawani.beans;

/**
 * @author : Bhawani Singh Shekhawat 
 * @date : 28-Jun-2019
 */
public class Welcome {

	public Welcome(String message) {
		super();
		this.message = message;
	}

	private final String message;

	public String getMessage() {
		return message;
	}
}

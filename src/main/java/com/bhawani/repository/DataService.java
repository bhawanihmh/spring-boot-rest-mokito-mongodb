package com.bhawani.repository;

import org.springframework.stereotype.Repository;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 29-Jun-2019
 */
@Repository
public class DataService {
	public int[] retrieveAllData() {
		// Some dummy data
		// Actually this should talk to some database to get all the data
		return new int[] { 1, 2, 3, 4, 5 };
	}
}

package com.bhawani.service;

import com.bhawani.beans.StudentRegistration;
import com.bhawani.beans.StudentRegistrationReply;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 28-Jun-2019
 */
public interface StudentRegisterService {
	/**
	 * 
	 * @param studentregd
	 * @return
	 */
	public StudentRegistrationReply registerStudent(StudentRegistration studentregd);

}

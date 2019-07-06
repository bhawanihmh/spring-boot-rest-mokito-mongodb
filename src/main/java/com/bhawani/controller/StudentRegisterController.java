package com.bhawani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhawani.beans.StudentRegistration;
import com.bhawani.beans.StudentRegistrationReply;
import com.bhawani.service.StudentRegisterService;

/**
 * @author : Bhawani Singh Shekhawat
 * @date : 28-Jun-2019
 */
@Controller
public class StudentRegisterController {
	
	@Autowired
	private StudentRegisterService studentRegisterService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	@ResponseBody
	StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentregd) {
		
		return studentRegisterService.registerStudent(studentregd);
	}
}

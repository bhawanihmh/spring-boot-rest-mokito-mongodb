/**
 * 
 */
package com.bhawani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhawani.beans.Welcome;
import com.bhawani.models.StudentData;
import com.bhawani.repository.StudentDataRepository;

/**
 * @author : Bhawani Singh Shekhawat 
 * @date : 28-Jun-2019
 */
@RestController
public class WelcomeController {
	private static final String welcomemsg = "Welcome Mr. %s!";
	
	@GetMapping (value="/welcome11/user")
	public String Hello()
	{
		return "Hello World";
	}

	@RequestMapping(value = "/welcome/user", method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_JSON_VALUE }
	)
	public Welcome welcomeUser(@RequestParam(name = "name", required = false, defaultValue = "Bhawani Singh") String name) {
		System.out.println("**************  WelcomeController.welcomeUser()");
		return new Welcome(String.format(welcomemsg, name));
	}
	
	@Autowired
	private StudentDataRepository studentDataRepository;
	@RequestMapping(value = "/studentdatas", method = RequestMethod.GET, 
			produces = { MediaType.APPLICATION_JSON_VALUE }
			)
	public List<StudentData> getAllStudentDatas() {
		return studentDataRepository.findAll();
	}
}
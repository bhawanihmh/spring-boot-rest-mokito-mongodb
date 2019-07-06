/**
 * 
 * 
 */
package com.bhawani.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhawani.models.StudentData;
import com.bhawani.repository.StudentDataRepository;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 30-Jun-2019
 */
@RestController
@RequestMapping(value = "/studentdatas")
public class StudentDataController {
	@Autowired
	private StudentDataRepository studentDataRepository;

	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<StudentData> getAllStudentDatass() {
		return studentDataRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public StudentData getStudentDataById(@PathVariable ObjectId id) {
		return studentDataRepository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public String modifyStudentDataById(@PathVariable("id") ObjectId id, @Valid @RequestBody StudentData studentData) {
		studentData.set_id(id);
		studentDataRepository.save(studentData);
		return "Sucess";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public StudentData createStudentData(@Valid @RequestBody StudentData studentData) {
		studentData.set_id(ObjectId.get());
		studentDataRepository.save(studentData);
		return studentData;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteStudentData(@PathVariable ObjectId id) {
		studentDataRepository.delete(studentDataRepository.findBy_id(id));
		return "Sucess";
	}
}

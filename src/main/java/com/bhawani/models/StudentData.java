/**
 * 
 * 
 */
package com.bhawani.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 30-Jun-2019
 */
public class StudentData {
	@Id
	public ObjectId _id;

	public String name;
	public String email;
	public int courseCount;
		
	public StudentData() {
		super();
	}

	/**
	 * @param _id
	 * @param name
	 * @param email
	 * @param courseCount
	 */
	public StudentData(ObjectId _id, String name, String email, int courseCount) {
		super();
		this._id = _id;
		this.name = name;
		this.email = email;
		this.courseCount = courseCount;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id.toHexString(); 
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the courseCount
	 */
	public int getCourseCount() {
		return courseCount;
	}

	/**
	 * @param courseCount the courseCount to set
	 */
	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
}

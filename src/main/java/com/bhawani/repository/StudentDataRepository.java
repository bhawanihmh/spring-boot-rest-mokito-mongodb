/**
 * 
 * 
 */
package com.bhawani.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhawani.models.StudentData;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 30-Jun-2019
 */
public interface StudentDataRepository extends MongoRepository<StudentData, String> {
	StudentData findBy_id(ObjectId _id);
}

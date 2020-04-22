package com.mshala.service.repository;

import com.mshala.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends MongoRepository<Student, String> {
}

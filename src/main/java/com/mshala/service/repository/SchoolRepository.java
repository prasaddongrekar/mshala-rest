package com.mshala.service.repository;

import com.mshala.model.School;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchoolRepository extends MongoRepository<School, String> {
}

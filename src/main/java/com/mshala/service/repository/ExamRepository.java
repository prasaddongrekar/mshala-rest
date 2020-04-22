package com.mshala.service.repository;

import com.mshala.model.Exam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ExamRepository extends MongoRepository<Exam, String> , ExamRepositoryCustom {
}

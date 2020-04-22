package com.mshala.service.repository;

import com.mshala.model.Holiday;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface HolidayRepository extends MongoRepository<Holiday, String>, HolidayRepositoryCustom {
}

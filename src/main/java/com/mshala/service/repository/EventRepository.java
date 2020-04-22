package com.mshala.service.repository;

import com.mshala.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface EventRepository extends MongoRepository<Event, String>, EventRepositoryCustom {


}

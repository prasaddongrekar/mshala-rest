package com.mshala.service.service;


import com.mshala.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

    List<Event> getAllEvents(String schoolId);
}

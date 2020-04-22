package com.mshala.service.service.impl;

import com.mshala.model.Event;
import com.mshala.service.repository.EventRepository;
import com.mshala.service.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.event.EventContext;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents(String schoolId) {
        return eventRepository.findBySchoolId(schoolId);
    }
}

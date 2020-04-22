package com.mshala.service.repository.impl;

import com.mshala.model.Event;
import com.mshala.service.repository.EventRepositoryCustom;

import java.util.Collections;
import java.util.List;

public class EventRepositoryCustomImpl implements EventRepositoryCustom {

    @Override
    public List<Event> findBySchoolId(String schoolId) {
        //TODO write custom query to fetch post schoolId generator done
        return Collections.emptyList();
    }
}

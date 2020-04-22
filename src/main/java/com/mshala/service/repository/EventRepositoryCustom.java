package com.mshala.service.repository;

import com.mshala.model.Event;

import java.util.List;

public interface EventRepositoryCustom {

    List<Event> findBySchoolId(String schoolId);
}

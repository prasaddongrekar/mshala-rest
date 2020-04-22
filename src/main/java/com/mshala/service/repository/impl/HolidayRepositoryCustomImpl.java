package com.mshala.service.repository.impl;

import com.mshala.model.Holiday;
import com.mshala.service.repository.HolidayRepository;
import com.mshala.service.repository.HolidayRepositoryCustom;

import java.util.Collections;
import java.util.List;

public class HolidayRepositoryCustomImpl implements HolidayRepositoryCustom {

    @Override
    public List<Holiday> findHolidaysBySchoolId(String schoolId) {
        //TODO custom query to fetch holidays
        return Collections.emptyList();
    }
}

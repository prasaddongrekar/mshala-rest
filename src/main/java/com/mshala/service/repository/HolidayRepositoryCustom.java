package com.mshala.service.repository;

import com.mshala.model.Holiday;

import java.util.List;

public interface HolidayRepositoryCustom {

    List<Holiday> findHolidaysBySchoolId(String schoolId);
}

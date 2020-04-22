package com.mshala.service.service.impl;
import com.mshala.model.Holiday;
import com.mshala.service.repository.HolidayRepository;

import com.mshala.service.service.HolidayService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService {

    @Autowired
    HolidayRepository holidayRepository;

    @Override
    public List<Holiday> getAllHolidays(String schoolId) {
        return holidayRepository.findHolidaysBySchoolId(schoolId);
    }
}

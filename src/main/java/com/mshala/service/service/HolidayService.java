package com.mshala.service.service;

import com.mshala.model.Holiday;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HolidayService {

    List<Holiday> getAllHolidays(String schoolId);


}

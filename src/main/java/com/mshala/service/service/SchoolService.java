package com.mshala.service.service;

import com.mshala.model.School;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SchoolService {

    List<School> getAllSchools();

    Optional<School> findBySchoolId(String schoolId);
}

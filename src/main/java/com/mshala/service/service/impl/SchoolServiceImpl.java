package com.mshala.service.service.impl;

import com.mshala.model.School;
import com.mshala.service.repository.SchoolRepository;
import com.mshala.service.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public List<School> getAllSchools(){

        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> findBySchoolId(String schoolId) {
        return schoolRepository.findById(schoolId);
    }
}

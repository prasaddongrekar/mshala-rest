package com.mshala.service.service.impl;

import com.mshala.model.Exam;
import com.mshala.service.repository.ExamRepository;
import com.mshala.service.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    ExamRepository examRepository;

    @Override
    public List<Exam> getExamBySchoolId(String schoolId) {
        return examRepository.findExamsBySchoolId(schoolId);
    }
}

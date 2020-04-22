package com.mshala.service.service;

import com.mshala.model.Exam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamService {

    List<Exam> getExamBySchoolId(String schoolId);
}

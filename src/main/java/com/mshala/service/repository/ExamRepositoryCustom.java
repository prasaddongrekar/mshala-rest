package com.mshala.service.repository;

import com.mshala.model.Exam;

import java.util.List;

public interface ExamRepositoryCustom {

    List<Exam> findExamsBySchoolId(String schoolId);
}

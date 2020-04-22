package com.mshala.service.repository.impl;

import com.mshala.model.Exam;
import com.mshala.service.repository.ExamRepositoryCustom;

import java.util.List;

public class ExamRepositoryCustomImpl implements ExamRepositoryCustom {

    @Override
    public List<Exam> findExamsBySchoolId(String schoolId) {
        //TODO custom Query to fetchExamBySchoolId
        return null;
    }
}

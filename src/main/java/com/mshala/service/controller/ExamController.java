package com.mshala.service.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.mshala.model.Exam;
import com.mshala.model.View;
import com.mshala.service.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest/exam")
public class ExamController {

    @Autowired
    ExamService examService;

    @JsonView(View.Public.class)
    @GetMapping("")
    public List<Exam> getExamsBySchoolId(@RequestParam String schoolId){
        return examService.getExamBySchoolId(schoolId);
    }
}

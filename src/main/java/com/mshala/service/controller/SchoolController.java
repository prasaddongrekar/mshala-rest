package com.mshala.service.controller;

import com.mshala.model.Event;
import com.mshala.model.School;
import com.mshala.service.service.EventService;
import com.mshala.service.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @Autowired
    EventService eventService;

    @GetMapping("")
    public List<School> getSchool(){
        return schoolService.getAllSchools();
    }

    @GetMapping("/id")
    public School getSchoolById(@RequestParam String schoolId){
        return schoolService.findBySchoolId(schoolId).get();
    }

    @GetMapping("/event")
    public List<Event> getEvents(@RequestParam String schoolId){
        return eventService.getAllEvents(schoolId);
    }
}

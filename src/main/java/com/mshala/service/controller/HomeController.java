package com.mshala.service.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.mshala.model.Holiday;
import com.mshala.model.View;
import com.mshala.service.service.CacheService;
import com.mshala.service.service.CommunicationService;
import com.mshala.service.service.HolidayService;
import com.mshala.service.service.OtpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest/home")
public class HomeController {

    @Autowired
    OtpService otpService;
    @Autowired
    CommunicationService<String, String, String> communicationService;
    @Autowired
    CacheService cacheService;
    @Autowired
    HolidayService holidayService;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/health")
    public String health(){
        return "System is up";
    }

    @GetMapping("/otp")
    public String generateOtp(@RequestParam String mobileNumber){

        String otp = otpService.getOtp(mobileNumber);
        logger.debug(" otp : {}", otp );
        communicationService.sendMessage("Otp from EduBuzz", "Your otp for logging in is : " + otp , "prasaddongrekar@gmail.com");

        return otp;
    }

    @PostMapping("/verify")
    public boolean verifyOtp(@RequestParam String otp, @RequestParam String mobileNumber){

        return cacheService.verify(mobileNumber, otp);
    }

    @JsonView(View.Public.class)
    @GetMapping("/holidays")
    public List<Holiday> getAllHolidays(@RequestParam String schoolId){

        return holidayService.getAllHolidays(schoolId);
    }
}

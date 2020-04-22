package com.mshala.service.service.impl;

import com.mshala.service.service.CacheService;
import com.mshala.service.service.OtpGeneratorService;
import com.mshala.service.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtpServiceImpl implements OtpService {

    @Autowired
    OtpGeneratorService otpGeneratorService;
    @Autowired
    CacheService cacheService;

    @Override
    public String getOtp(String userName) {
        String otp =  otpGeneratorService.generateOtp(userName);
        cacheService.put(userName, otp);
        return otp;
    }
}

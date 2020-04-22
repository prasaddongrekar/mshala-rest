package com.mshala.service.service;

import org.springframework.stereotype.Service;

@Service
public interface OtpService {

    String getOtp(String userName);

}

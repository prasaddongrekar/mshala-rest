package com.mshala.service.service;

import com.mshala.model.Student;
import com.mshala.model.UserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Student save(UserRequest userRequest);
}

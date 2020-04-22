package com.mshala.service.service.impl;

import com.mshala.model.Grade;
import com.mshala.model.Student;
import com.mshala.model.UserRequest;
import com.mshala.service.util.UserUtil;
import com.mshala.service.service.UserService;
import com.mshala.service.exception.InvalidUserException;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @SneakyThrows(InvalidUserException.class)
    @Override
    public Student save(UserRequest userRequest) {
        if(userRequest == null || !UserUtil.isValid(userRequest))
            throw new InvalidUserException("Invalid UserRequest");

        Student student = new Student();
        student.setGrade(Grade.valueOf(userRequest.getGrade()));
        student.setGuardianName(userRequest.getGuardianName());
        student.setMobileNumber(userRequest.getMobileNumber());
        student.setName(userRequest.getStudentName());

//        user = userRepository.save(user);
        logger.info("User saved : {} ", student);

        return student;
    }
}

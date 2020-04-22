package com.mshala.service.util;

import org.springframework.stereotype.Component;

@Component
public interface SequenceGenerator {

    String getNextSequenceId(String key);

}

package com.mshala.service.service;

import org.springframework.stereotype.Component;

@Component
public interface CommunicationService<S, B, T> {
    boolean sendMessage(S subject, B body, T to);
}

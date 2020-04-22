package com.mshala.service.exception;

import lombok.Data;

@Data
public class SequenceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errCode;
    private String errMsg;

    public SequenceException(String errMsg) {
        super(errMsg);
        this.errMsg = errMsg;
    }
}

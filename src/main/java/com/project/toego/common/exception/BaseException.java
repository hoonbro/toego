package com.project.toego.common.exception;

import com.project.toego.common.error.BaseErrorCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final BaseErrorCode errorCode;

    public BaseException(BaseErrorCode errorCode, Throwable reason) {
        super(errorCode.getMessage(), reason);
        this.errorCode = errorCode;
    }

    public BaseException(BaseErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}

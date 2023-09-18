package com.project.toego.common.exception;

import com.project.toego.common.error.BaseErrorCode;
import com.project.toego.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final BaseErrorCode errorCode;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BaseException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseException(String message, ErrorCode errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}

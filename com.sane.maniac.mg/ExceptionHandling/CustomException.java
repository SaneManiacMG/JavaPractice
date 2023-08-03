package com.sane.maniac.mg.ExceptionHandling;

import java.io.IOException;

public class CustomException extends IOException {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

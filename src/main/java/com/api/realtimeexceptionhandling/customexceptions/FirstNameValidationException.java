package com.api.realtimeexceptionhandling.customexceptions;

public class FirstNameValidationException extends RuntimeException {

    public FirstNameValidationException(String message) {
        super(message);
    }

}

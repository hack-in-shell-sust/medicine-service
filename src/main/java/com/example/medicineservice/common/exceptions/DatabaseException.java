package com.example.medicineservice.common.exceptions;


import com.example.medicineservice.common.enums.ResponseMessage;

public class DatabaseException extends CustomRootException {
    private static final String MESSAGE_CODE = "ERPS422";

    public DatabaseException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public DatabaseException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}

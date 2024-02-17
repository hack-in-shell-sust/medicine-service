package com.example.medicineservice.common.exceptions;


import com.example.medicineservice.common.enums.ResponseMessage;

public class OperationFailedException extends CustomRootException {
    private static final String MESSAGE_CODE = "EREV101";

    public OperationFailedException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public OperationFailedException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}

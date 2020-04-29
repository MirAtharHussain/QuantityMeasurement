package com.bridgelabz.Quantity;

public class QuantityMeasurementException extends Exception {

    enum ExceptionType{WRONG_UNIT;
    }

    public QuantityMeasurementException(String message, ExceptionType wrongUnit) {
        super(message);
    }
}


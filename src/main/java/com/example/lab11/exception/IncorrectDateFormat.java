package com.example.lab11.exception;

import java.util.zip.DataFormatException;

public class IncorrectDateFormat extends DataFormatException {
    public IncorrectDateFormat(String message) {
        super(message);
    }
}

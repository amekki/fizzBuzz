package com.tdd.kata.converter;

public class PlainNumberConverter extends ConversionHandler{

    public PlainNumberConverter(ConversionHandler conversionHandler) {
        super(conversionHandler);
    }

    public String convert(int number) {
        return String.valueOf(number);
    }
}

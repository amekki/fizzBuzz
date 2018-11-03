package com.tdd.kata.converter;

public abstract class ConversionHandler {

    private ConversionHandler conversionHandler;

    public ConversionHandler(ConversionHandler conversionHandler) {
        this.conversionHandler = conversionHandler;
    }

    public abstract String convert(int number);

    public ConversionHandler getConversionHandler() {
        return conversionHandler;
    }
}

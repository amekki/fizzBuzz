package com.tdd.kata.converter;

public class BuzzConverter extends ConversionHandler{

    public BuzzConverter(ConversionHandler conversionHandler) {
        super(conversionHandler);
    }

    public String convert(int number) {
        if(number %5 == 0) return "Buzz";
        return getConversionHandler().convert(number);
    }
}

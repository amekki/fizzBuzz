package com.tdd.kata.converter;

public class FizzConverter extends ConversionHandler{

    public FizzConverter(ConversionHandler conversionHandler) {
        super(conversionHandler);
    }

    public String convert(int number) {
        if(number % 3 == 0) return "Fizz";
        return getConversionHandler().convert(number);
    }

}

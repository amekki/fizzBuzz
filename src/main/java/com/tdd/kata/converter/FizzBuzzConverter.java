package com.tdd.kata.converter;

public class FizzBuzzConverter extends ConversionHandler {

    public FizzBuzzConverter(ConversionHandler conversionHandler) {
        super(conversionHandler);
    }

    public String convert(int number) {
        if(number % 15 == 0) return "FizzBuzz";
        return getConversionHandler().convert(number);
    }

}

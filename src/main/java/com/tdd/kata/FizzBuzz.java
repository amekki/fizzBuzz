package com.tdd.kata;

import com.tdd.kata.converter.*;

public class FizzBuzz {

    private final ConversionHandler fizzBuzzConverter;

    public FizzBuzz() {
        ConversionHandler plainNumberConverter = new PlainNumberConverter(null);
        ConversionHandler fizzConverter = new FizzConverter(plainNumberConverter);
        ConversionHandler buzzConverter = new BuzzConverter(fizzConverter);
        fizzBuzzConverter = new FizzBuzzConverter(buzzConverter);
    }

    public String convert(int number) {
        checkIsInRange(number);
        return fizzBuzzConverter.convert(number);
    }

    private void checkIsInRange(int number) {
        if(number <= 0) throw new IllegalArgumentException("negative value is not supported");
    }
}

package com.tdd.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.IllegalArgumentException

class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    fun should_return_number_toString() {
        assertThat(fizzBuzz.convert(1)).isEqualTo("1")
        assertThat(fizzBuzz.convert(2)).isEqualTo("2")
    }

    @Test
    fun should_return_Fizz_toString_when_input_multiple_3() {
        assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz")
        assertThat(fizzBuzz.convert(6)).isEqualTo("Fizz")
    }

    @Test
    fun should_return_Buzz_toString_when_input_multiple_5() {
        assertThat(fizzBuzz.convert(5)).isEqualTo("Buzz")
        assertThat(fizzBuzz.convert(10)).isEqualTo("Buzz")
    }

    @Test
    fun should_return_FizzBuzz_toString_when_input_multiple_15() {
        assertThat(fizzBuzz.convert(15)).isEqualTo("FizzBuzz")
        assertThat(fizzBuzz.convert(30)).isEqualTo("FizzBuzz")
    }

    @Test(expected = IllegalArgumentException::class)
    fun should_not_support_number_0() {
        fizzBuzz.convert(0)
    }
    @Test(expected = IllegalArgumentException::class)
    fun should_not_support_negative_numbers() {
        fizzBuzz.convert(-1)
    }

}
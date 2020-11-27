package com.souhire.fizzbuzz;

public class FizzBuzz {

    public String process(int number) {
        if (number % 3 == 0)
            return "Fizz";
        return String.valueOf(number);
    }
}

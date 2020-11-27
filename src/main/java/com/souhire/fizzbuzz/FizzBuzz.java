package com.souhire.fizzbuzz;

public class FizzBuzz {

    public String process(int number) {
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}

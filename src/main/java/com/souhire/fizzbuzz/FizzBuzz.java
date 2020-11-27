package com.souhire.fizzbuzz;

public class FizzBuzz {

    public String process(int from, int to) {
        if (from == to)
            return transform(from);
        return transform(from) + process(++from, to);
    }

    private String transform(int number) {
        if (number % 15 == 0)
            return "FizzBuzz";
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}

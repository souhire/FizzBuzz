package com.souhire.fizzbuzz;

public class FizzBuzz {

    public String process(int from, int to) {
        String result = "";
        if (from == to)
            result = transform(from);
        if (from < to) {
            result += transform(from) + process(++from, to);
        }
        return result;
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

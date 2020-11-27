package com.souhire.fizzbuzz;

public class FizzBuzz {

    public String process(int from, int to) {
        if (to % 15 == 0)
            return "FizzBuzz";
        if (to % 3 == 0)
            return "Fizz";
        if (to % 5 == 0)
            return "Buzz";
        return String.valueOf(to);
    }
}

package com.souhire.tdd.fibonacci;

public class Fibonacci {

    public int calculate(int position) {
        if (position == 0 || position == 1)
            return position;
        return calculate(position - 1)
                + calculate(position - 2);
    }

}

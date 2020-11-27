package com.souhire.tdd.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        return (isDivisible(year, 4) &&
                !isDivisible(year, 100)) ||
                isDivisible(year, 400);
    }

    private boolean isDivisible(int year, int denominateur) {
        return year % denominateur == 0;
    }

}

package com.souhire.tdd.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if ((isDivisible(year, 4) && !isDivisible(year, 100)) ||
                isDivisible(year, 400))
            return true;
        return false;
    }

    private boolean isDivisible(int year, int denominateur) {
        return year % denominateur == 0;
    }

}

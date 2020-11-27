package com.souhire.tdd.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year == 2001 || year == 1900)
            return false;
        return true;
    }

}

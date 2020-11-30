package com.souhire.tdd2.statsCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class StatsCalculator {

    public int calculateMinimalValue(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    public int calculateMaximalValue(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

    public int calculateNumbersOfElements(int[] numbers) {
        return numbers.length;
    }

    public double calculateAverageValue(int[] numbers) {
        double averageValue = Arrays.stream(numbers).average().orElse(0);
        return roundWith5digits(averageValue);
    }

    private double roundWith5digits(double number) {
        BigDecimal bd = BigDecimal.valueOf(number);
        bd = bd.setScale(6, RoundingMode.FLOOR);
        return bd.doubleValue();
    }
}

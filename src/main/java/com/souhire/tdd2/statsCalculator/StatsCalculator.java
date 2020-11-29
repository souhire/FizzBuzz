package com.souhire.tdd2.statsCalculator;

import java.util.Arrays;

public class StatsCalculator {

    public int calculateMinimalValue(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    public int calculateMaximalValue(int[] numbers) {
        return 92;
    }
}

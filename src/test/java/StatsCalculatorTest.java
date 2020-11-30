import com.souhire.tdd2.statsCalculator.StatsCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsCalculatorTest {

    private int [] numbers;

    @BeforeEach
    private void setUp() {
        //Arrange
        numbers = new int[]{6, 9, 15, -2, 92, 11};
    }

    @Test void shouldReturnMinus2IfMinimalValueIsMinus2() {
        //Assert
        assertEquals(-2, getMinimalValue(-2));
    }

    @Test void shouldReturnZeroIfMinimalValueIsZero() {
        //Assert
        assertEquals(0, getMinimalValue(0));
    }

    @Test void shouldReturn92IfMaximalValueIs92() {
        assertEquals(92, getMaximalValue(92));
    }

    @Test void shouldReturn100IfMaximalValueIs100() {
        assertEquals(100, getMaximalValue(100));
    }

    @Test void shouldReturn6IfNumbersContains6elements() {
        assertEquals(6, new StatsCalculator().calculateNumbersOfElements(numbers));
    }

    @Test void shouldReturn7IfNumbersContains7elements() {
        assertEquals(7, new StatsCalculator()
                .calculateNumbersOfElements(Arrays.copyOf(numbers, 7)));
    }

    @Test void shouldReturn21Dot833333AverageValue() {
        assertEquals(21.833333, new StatsCalculator().calculateAverageValue(numbers));
    }

    @Test void shouldReturn21Dot166666AverageValue() {
        numbers[3] = 0;
        assertEquals(22.166666, new StatsCalculator().calculateAverageValue(numbers));
    }

    private int getMinimalValue(int i) {
        //Arrange
        numbers[3] = i;
        //Act
        return new StatsCalculator().calculateMinimalValue(numbers);
    }

    private int getMaximalValue(int i) {
        //Arrange
        numbers[4] = i;
        //Act
        return new StatsCalculator().calculateMaximalValue(numbers);
    }

}

import com.souhire.tdd2.statsCalculator.StatsCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    private int getMinimalValue(int i) {
        //Arrange
        numbers[3] = i;
        //Act
        return new StatsCalculator().calculateMinimalValue(numbers);
    }

}

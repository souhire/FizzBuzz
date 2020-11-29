import com.souhire.tdd2.statsCalculator.StatsCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsCalculatorTest {

    @Test void shouldReturnMinus2IfMinimalValueIsMinus2() {
        //Arrange
        int [] numbers = {6, 9, 15, -2, 92, 11};
        //Act
        int minimalValue = new StatsCalculator().calculateMinimalValue(numbers);
        //Assert
        assertEquals(-2, minimalValue);
    }

    @Test void shouldReturnZeroIfMinimalValueIsZero() {
        //Arrange
        int [] numbers = {6, 9, 15, 0, 92, 11};
        //Act
        int minimalValue = new StatsCalculator().calculateMinimalValue(numbers);
        //Assert
        assertEquals(0, minimalValue);
    }

}

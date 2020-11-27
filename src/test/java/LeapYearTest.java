import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void shouldReturnTrueIfYearIs1996() {
        assertEquals(true, new LeapYear().isLeapYear());
    }

}

import com.souhire.tdd.leapyear.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void shouldReturnTrueIfYearIs1996() {
        assertEquals(true, new LeapYear().isLeapYear(1996));
    }

    @Test
    public void shouldReturnFalseIfYearIs2001() {
        assertEquals(false, new LeapYear().isLeapYear(2001));
    }

}

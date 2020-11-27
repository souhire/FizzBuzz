import com.souhire.tdd.leapyear.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void shouldReturnTrueIfYearIs4() {
        assertEquals(true, new LeapYear().isLeapYear(4));
    }

    @Test void shouldReturnFalseIfYearIs6() {
        assertEquals(false, new LeapYear().isLeapYear(6));
    }

    @Test void shouldReturnTrueIfYearIs8() {
        assertEquals(true, new LeapYear().isLeapYear(8));
    }

}

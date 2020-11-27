import com.souhire.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", new FizzBuzz().process(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", new FizzBuzz().process(2));
    }

    @Test
    public void shouldReturn4IfNumberIs4() {
        assertEquals("4", new FizzBuzz().process(4));
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", new FizzBuzz().process());
    }

}

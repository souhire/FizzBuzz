import com.souhire.tdd.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test void shouldBe0IfPositionIs0() {
        assertEquals(0, new Fibonacci().calculate(0));
    }

    @Test void shouldBe1IfPositionIs1() {
        assertEquals(1, new Fibonacci().calculate(1));
    }

    @Test void shouldBe1IfPositionIs2() {
        assertEquals(1, new Fibonacci().calculate(2));
    }

    @Test void shouldBe2IfPositionIs3() {
        assertEquals(2, new Fibonacci().calculate(3));
    }

    @Test void shouldBe3IfPositionIs4() {
        assertEquals(3, new Fibonacci().calculate(4));
    }

}

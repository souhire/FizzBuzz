import com.souhire.tdd.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test void shouldbe0IfPositionIs0() {
        assertEquals(0, new Fibonacci().calculate(0));
    }

}

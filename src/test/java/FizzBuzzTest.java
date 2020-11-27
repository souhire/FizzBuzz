import com.souhire.tdd.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", new FizzBuzz().process(1, 1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", new FizzBuzz().process(2, 2));
    }

    @Test
    public void shouldReturn4IfNumberIs4() {
        assertEquals("4", new FizzBuzz().process(4, 4));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", new FizzBuzz().process(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6() {
        assertEquals("Fizz", new FizzBuzz().process(6, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() {
        assertEquals("Buzz", new FizzBuzz().process(5, 5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs10() {
        assertEquals("Buzz", new FizzBuzz().process(10, 10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15() {
        assertEquals("FizzBuzz", new FizzBuzz().process(15, 15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30() {
        assertEquals("FizzBuzz", new FizzBuzz().process(30, 30));
    }

    @Test
    public void shouldReturn12IfNumbersAre1And2() {
        assertEquals("12", new FizzBuzz().process(1, 2));
    }

    @Test
    public void shouldReturn12FizzIfNumbersAre1to3() {
        assertEquals("12Fizz", new FizzBuzz().process(1, 3));
    }

    @Test
    public void shouldReturn12Fizz4BuzzIfNumbersAre1to5() {
        assertEquals("12Fizz4Buzz", new FizzBuzz().process(1, 5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzIf1to15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", new FizzBuzz().process(1, 15));
    }

}

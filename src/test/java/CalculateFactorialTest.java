import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

public class CalculateFactorialTest {

    @ParameterizedTest(name="Factorial of {0} is {1}")
    @MethodSource("range")
    public void testCalculateFactorial(int n, int expected){
        assertEquals(expected, CalculateFactorial.calculateFactorial(n));
    }

    static Stream<Arguments> range() {
        return Stream.of(
                arguments(0, 1),
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 6)
        );
    }

}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckStringLengthTest {

    @Test
    public void checkStringLengthGreater20(){
        // GIVEN
        String testString = "Kekse sind das Beste der Welt und Olaf auch!";

        // WHEN
        boolean result = CheckStringLength.stringLength(testString);

        // THEN
        assertEquals(true, result);
    }

    @Test
    public void checkStringLengthLowerThan20() {
        // GIVEN
        String testString = "Kekse";

        // WHEN
        boolean result = CheckStringLength.stringLength(testString);

        // THEN
        assertEquals(false, result);

    }

    @ParameterizedTest
    @CsvSource({
            "Donaudampfschifffahrtsgeschellschaft, true",
            "Pudding, false"
    })
    public void parameterTest(String testString, boolean expectedResult) {

        assertEquals(expectedResult, CheckStringLength.stringLength(testString));
    }

}

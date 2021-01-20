import org.junit.jupiter.api.Test;

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
}

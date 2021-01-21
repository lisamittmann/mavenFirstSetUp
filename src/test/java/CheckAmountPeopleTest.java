import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAmountPeopleTest {

    @ParameterizedTest
    @CsvSource({
            "30, 'Less than or 30 people'",
            "18, 'Less than or 30 people'",
            "59, 'More than 30 people'"
    })
    public void testCheckGreater30(int amount, String result){
        assertEquals(result, CheckAmountPeople.checkGreater30(amount));
    }
}

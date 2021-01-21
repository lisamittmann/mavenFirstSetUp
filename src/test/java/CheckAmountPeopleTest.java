import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAmountPeopleTest {

    @ParameterizedTest
    @CsvSource({
            "30, 'yellow', 'Amount of people is okay'",
            "45, 'yellow', 'Amount of people is not okay'",
            "59, 'green', 'Amount of people is okay'",
            "13, 'red', 'Amount of people is not okay'",
            "65, 'green', 'Amount of people is not okay'",
            "17, 'orange', 'Undefined level or amount'"
    })
    public void testCheckGreater30(int amount, String level, String result){
        assertEquals(result, CheckAmountPeople.checkGreater30(amount, level));
    }
}

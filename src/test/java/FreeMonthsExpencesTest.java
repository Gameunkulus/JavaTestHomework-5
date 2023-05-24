import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreeMonthsExpences;

public class FreeMonthsExpencesTest {
    @Test
    void shouldCalculateForZeroStart() {
        FreeMonthsExpences prog = new FreeMonthsExpences();
        int account = 0;
        int income = 10000;
        int expences = 3000;
        int threshold = 20000;
        int expected = 14888;
        int actual = prog.calculate(account, income, expences, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

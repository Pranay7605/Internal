import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculateTest1{

    @Test
    public void testSum() {
        Calculate calculation = new Calculate();
        int sum = calculation.sum(10, 5);
        int expected = 15;

        System.out.println("@Test sum(): " + sum + " = " + expected);
        assertEquals(expected, sum);
    }
}
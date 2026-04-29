    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

// Test Class
import static org.junit.Assert.*;
import org.junit.Test;

public class EvenNumberTest {

    @Test
    public void testIsEven() {
        int sampleNo = 2;
        EvenNumber numbereven = new EvenNumber();
        assertTrue(numbereven.isEven(sampleNo));
    }

    @Test
    public void testIsEven_FalseCondition() {
        int sampleNo2 = 3;
        EvenNumber numbereven = new EvenNumber();
        assertFalse(numbereven.isEven(sampleNo2));
    }
}



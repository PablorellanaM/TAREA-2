package uvg.edu.gt;

//Testing unitario
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    @Test
    public void testSuma() {
        Calc calculadora = new Calc();
        assertEquals(5, calculadora.suma(2, 3));
    }
}

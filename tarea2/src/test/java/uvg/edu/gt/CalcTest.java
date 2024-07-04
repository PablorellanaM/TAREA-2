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

    @Test
    public void testResta() {
        Calc calculadora = new Calc();
        assertEquals(1, calculadora.resta(3, 2));
    }

    @Test
    public void testMultiplicacion() {
        Calc calculadora = new Calc();
        assertEquals(6, calculadora.multiplicacion(2, 3));
    }
}

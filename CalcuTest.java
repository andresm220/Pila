import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcuTest{
    private ICustom<Integer> stack;
    private Calculadora calculadora;

    @Before
    public void setUp() {
        stack = new CustomStack<>();
        calculadora = new Calculadora(stack);
    }

    @Test
    public void testSumar() {
        stack.push(2);
        stack.push(3);

        assertEquals(5, calculadora.sumar());
    }

    @Test
    public void testResta() {
        stack.push(5);
        stack.push(2);

        assertEquals(3, calculadora.resta());
    }

    @Test
    public void testMultiplicacion() {
        stack.push(4);
        stack.push(3);

        assertEquals(12, calculadora.multiplicacion());
    }
}
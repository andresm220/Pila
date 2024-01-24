import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la Calculadora.
 */
public class CalcuTest {
    private ICustom<Integer> stack;
    private Calculadora calculadora;

    /**
     * Configuración inicial para cada prueba.
     */
    @Before
    public void setUp() {
        stack = new CustomStack<>();
        calculadora = new Calculadora(stack);
    }

    /**
     * Prueba la operación de suma.
     */
    @Test
    public void testSumar() {
        stack.push(2);
        stack.push(3);

        // Verifica que la suma de 2 y 3 sea igual a 5.
        assertEquals(5, calculadora.sumar());
    }

    /**
     * Prueba la operación de resta.
     */
    @Test
    public void testResta() {
        stack.push(5);
        stack.push(2);

        // Verifica que la resta de 5 y 2 sea igual a 3.
        assertEquals(3, calculadora.resta());
    }

    /**
     * Prueba la operación de multiplicación.
     */
    @Test
    public void testMultiplicacion() {
        stack.push(4);
        stack.push(3);

        // Verifica que la multiplicación de 4 por 3 sea igual a 12.
        assertEquals(12, calculadora.multiplicacion());
    }

    /**
     * Prueba la operación de división.
     */
    public void testDivision() {
        stack.push(10);
        stack.push(2);

        // Realiza la operación de división y verifica el resultado.
        boolean divisionExitosa = calculadora.division();
        assertTrue(divisionExitosa);
        int resultado = stack.pop();

        // Verifica que la división de 10 por 2 sea igual a 5.
        assertEquals(5, resultado);
    }

    /**
     * Prueba la excepción arrojada al dividir por cero.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        stack.push(5);
        stack.push(0);

        // Intenta realizar la operación de división por cero (debería lanzar una excepción).
        calculadora.division();
    }

    /**
     * Prueba la excepción arrojada al intentar sumar sin operandos suficientes.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSumaSinOperandosSuficientes() {
        stack.push(5);

        // Intenta realizar la operación de suma sin suficientes operandos (debería lanzar una excepción).
        calculadora.sumar();
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementación de la interfaz ICalc que realiza operaciones aritmeticas
 * utilizando una pila (stack) de enteros.
 */
public class Calculadora implements ICalc {

    /**
     * Pila (stack) utilizada para almacenar operandos.
     */
    private ICustom<Integer> stack;

    /**
     * Constructor que recibe una pila (stack) como parámetro.
     *
     * @param stack La pila a utilizar para almacenar operandos.
     */
    public Calculadora(ICustom<Integer> stack) {
        this.stack = stack;
    }

    /**
     * Realiza la operación de suma tomando dos operandos de la pila.
     *
     * @return El resultado de la suma.
     * @throws IllegalArgumentException Si faltan operandos para la suma.
     */
    public int sumar() {
        Integer operandoB = stack.pop();
        Integer operandoA = stack.pop();
        if (operandoA != null && operandoB != null) {
            return operandoA + operandoB;
        } else {
            throw new IllegalArgumentException("Faltan operandos para la suma.");
        }
    }

    /**
     * Realiza la operación de resta tomando dos operandos de la pila.
     *
     * @return El resultado de la resta.
     * @throws IllegalArgumentException Si faltan operandos para la resta.
     */
    public int resta() {
        Integer operandoB = stack.pop();
        Integer operandoA = stack.pop();
        if (operandoA != null && operandoB != null) {
            return operandoA - operandoB;
        } else {
            throw new IllegalArgumentException("Faltan operandos para la resta.");
        }
    }
    /*
     * Realiza la operación de resta tomando dos operandos de la pila.
     */
    public int multiplicacion() {
        Integer operandoB = stack.pop();
        Integer operandoA = stack.pop();
        if (operandoA != null && operandoB != null) {
            return operandoA * operandoB;
        } else {
            throw new IllegalArgumentException("Faltan operandos para la multiplicación.");
        }
    }
    
    /*
     * Realiza la operación de resta tomando dos operandos de la pila.
     */
    public int division() {
        Integer operandoB = stack.pop();
        Integer operandoA = stack.pop();
        if (operandoA != null && operandoB != null && operandoB != 0) {
            return operandoA / operandoB;
        } else {
            throw new IllegalArgumentException("Faltan operandos o división por cero.");
        }
    }

    @Override
    public String readTXT() {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

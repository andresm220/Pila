/**
 * Hoja de Trabajo 2 : Pila
 * Andrés Mazariegos y Daniel Juarez 
 * Algoritmos y estructura de datos
 */
public class Main {

    public static void main(String[] args) {
        ICustom<Integer> pila = new CustomStack<>();
        ICalc calculadora = new Calculadora(pila);

        calculadora.calculate();
    }
}


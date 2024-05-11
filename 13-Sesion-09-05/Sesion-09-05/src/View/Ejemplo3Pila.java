package View;

import javax.swing.JOptionPane;
import java.util.Stack;
import java.util.Random;

public class Ejemplo3Pila {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Quemar tres datos
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Llenar la pila con números aleatorios
        llenarPila(stack);

        // Luego quemar dos más:
        stack.push(12);
        stack.push(9);

        // Mostrar los datos de la pila hasta que esté vacía
        mostrarDatosPila(stack);
    }

    public static void llenarPila(Stack<Integer> stack) {
        Random rand = new Random();
        int numElementos = 3;
        for (int i = 0; i < numElementos; i++) {
            stack.push(rand.nextInt(100)); // Generar números aleatorios entre 0 y 99
        }
    }

    public static void mostrarDatosPila(Stack<Integer> stack) {
        JOptionPane.showMessageDialog(null, "Mostrando los datos de la pila:");
        while (!stack.isEmpty()) {
            int elemento = stack.pop();
            JOptionPane.showMessageDialog(null, "Elemento de la pila: " + elemento);
        }
        JOptionPane.showMessageDialog(null, "La pila está vacía.");
    }
}

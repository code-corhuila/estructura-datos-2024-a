package View;

import java.util.Stack;
public class Ejemplo1Pila {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Agregar elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(19);

        int topElement;

        // Obtener el elemento superior de la pila y eliminarlo
        topElement = stack.pop();
        System.out.println("Elemento superior de la pila: " + topElement);

        // Obtener el elemento superior de la pila y eliminarlo
        topElement = stack.pop();
        System.out.println("Elemento superior de la pila: " + topElement);

        // Obtener el elemento superior de la pila sin eliminarlo
        int peekElement = stack.peek();
        System.out.println("Elemento superior de la pila (sin eliminar): " + peekElement);

        // Verificar si la pila está vacía
        boolean isEmpty = stack.isEmpty();
        System.out.println("La pila está vacía: " + isEmpty);
    }
}

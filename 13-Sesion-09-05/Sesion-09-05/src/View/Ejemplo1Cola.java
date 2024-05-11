package View;

import java.util.Queue;
import java.util.LinkedList;

public class Ejemplo1Cola {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Agregar elementos a la cola
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(19);

        int topElement;

        // Obtener y eliminar el primer elemento de la cola
        topElement = queue.poll();
        System.out.println("Primer elemento de la cola: " + topElement);

        // Obtener y eliminar el primer elemento de la cola
        topElement = queue.poll();
        System.out.println("Primer elemento de la cola: " + topElement);

        // Obtener el primer elemento de la cola sin eliminarlo
        int peekElement = queue.peek();
        System.out.println("Primer elemento de la cola (sin eliminar): " + peekElement);

        // Verificar si la cola está vacía
        boolean isEmpty = queue.isEmpty();
        System.out.println("La cola está vacía: " + isEmpty);
    }
}

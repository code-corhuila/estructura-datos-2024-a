package View;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Ejemplo4Cola {
    public static void main(String[] args) {
        LinkedList<Integer> cola = new LinkedList<>();
        ArrayList<ArrayList<Integer>> listaEliminados = new ArrayList<>();

        // Agregar elementos a la cola
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);
        cola.offer(19);
        cola.offer(21);
        cola.offer(15);

        // Ciclo para eliminar elementos de la cola uno por uno
        while (!cola.isEmpty()) {
            try {
                // Eliminar elemento de la cola y guardar en lista
                int eliminado = cola.poll();
                ArrayList<Integer> pareja = new ArrayList<>();
                pareja.add(eliminado);
                if (!cola.isEmpty()) {
                    pareja.add(cola.peek());
                } else {
                    pareja.add(null);
                }
                listaEliminados.add(pareja);
            } catch (EmptyStackException e) {
                System.out.println("Se han eliminado todos los elementos de la cola.");
                break;
            }
        }

        // Mostrar lista con las parejas de elementos
        System.out.println("Elemento Eliminado | Siguiente Elemento");
        for (ArrayList<Integer> pareja : listaEliminados) {
            System.out.println(pareja.get(0) + "                 | " + (pareja.get(1) != null ? pareja.get(1) : "N/A"));
        }
    }
}

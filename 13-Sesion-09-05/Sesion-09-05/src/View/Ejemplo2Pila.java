package View;

import javax.swing.JOptionPane;
import java.util.EmptyStackException;
import java.util.Stack;

public class Ejemplo2Pila {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        while (true) {
            int opcion = mostrarMenu();
            try {
                switch (opcion) {
                    case 1:
                        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a agregar:"));
                        agregarElemento(stack, elemento);
                        break;
                    case 2:
                        eliminarElemento(stack);
                        break;
                    case 3:
                        int topElement = obtenerElementoSuperior(stack);
                        JOptionPane.showMessageDialog(null, "Elemento superior de la pila: " + topElement);
                        break;
                    case 4:
                        boolean isEmpty = estaVacia(stack);
                        JOptionPane.showMessageDialog(null, "La pila está vacía: " + isEmpty);
                        break;
                    case 5:
                        // Salir del programa
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione nuevamente.");
                }
            } catch (EmptyStackException e) {
                JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede realizar esta operación.");
            }
        }
    }

    public static int mostrarMenu() {
        String[] opciones = {"Agregar elemento", "Eliminar elemento", "Obtener elemento superior",
                "Verificar si la pila está vacía", "Salir del programa"};
        return JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
    }

    public static void agregarElemento(Stack<Integer> stack, int elemento) {
        stack.push(elemento);
        JOptionPane.showMessageDialog(null, "Elemento agregado correctamente.");
    }

    public static int obtenerElementoSuperior(Stack<Integer> stack) {
        return stack.peek();
    }

    public static void eliminarElemento(Stack<Integer> stack) {
        stack.pop();
        JOptionPane.showMessageDialog(null, "Elemento eliminado correctamente.");
    }

    public static boolean estaVacia(Stack<Integer> stack) {
        return stack.isEmpty();
    }
}

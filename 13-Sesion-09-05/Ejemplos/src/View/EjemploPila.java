package View;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class EjemploPila {
    public static void main(String[] Args){
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();

        //Cargar datos en la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);

        //Cargar datos de la cola
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        //Mostrar último dato de la pila y cola
        System.out.println(pila.peek());
        System.out.println(cola.peek());

        //Mostrar y eliminar último dato de la pila y cola
        System.out.println("Eliminado de pila: "+pila.pop());
        System.out.println("Eliminado de cola: "+cola.poll());

        //Cargar el dato 4
        pila.push(4);
        cola.offer(4);

        //Mostrar último dato de la pila y cola
        System.out.println("Dato que continua: "+pila.peek());
        System.out.println("Dato que continua: "+cola.peek());

        //Mostrar y eliminar último dato de la pila y cola
        System.out.println("Eliminado de pila: "+pila.pop());
        System.out.println("Eliminado de cola: "+cola.poll());
    }

}

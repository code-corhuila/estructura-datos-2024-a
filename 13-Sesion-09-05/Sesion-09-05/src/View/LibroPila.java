package View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import Model.Libro;

public class LibroPila {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        int n = 5;

        llenarPila(pila, n);

        ArrayList<Libro> libros = new ArrayList<>(); // Se crea la lista de libros

        // Iterar sobre la pila y crear libros con los datos correspondientes
        for (int i = 0; i < n; i++) {
            Libro libro = new Libro();
            libro.setId(pila.peek());
            libro.setTitulo("Título del Libro " + (i + 1));
            libro.setAutor("Autor del Libro " + (i + 1));
            libros.add(libro);
            pila.pop();
        }

        // Aquí mostrar los libros de la lista
        for (Libro libro : libros) {
            System.out.println("ID: " + libro.getId() + ", Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }

    public static void llenarPila(Stack<Integer> pila, int n) {
        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            pila.push(i);
        }
    }
}

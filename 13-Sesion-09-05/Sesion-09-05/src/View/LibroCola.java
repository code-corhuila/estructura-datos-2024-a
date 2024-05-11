package View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Model.Libro;

public class LibroCola {

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        int n = 5;

        llenarCola(cola, n);

        ArrayList<Libro> libros = new ArrayList<>(); // Se crea la lista de libros

        // Iterar sobre la cola y crear libros con los datos correspondientes
        for (int i = 0; i < n; i++) {
            Libro libro = new Libro();
            libro.setId(cola.peek());
            libro.setTitulo("Título del Libro " + (i + 1));
            libro.setAutor("Autor del Libro " + (i + 1));
            libros.add(libro);
            cola.poll();
        }

        // Aquí mostrar los libros de la lista
        for (Libro libro : libros) {
            System.out.println("ID: " + libro.getId() + ", Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }

    public static void llenarCola(Queue<Integer> cola, int n) {
        for (int i = 1; i <= n; i++) {
            cola.offer(i);
        }
    }
}

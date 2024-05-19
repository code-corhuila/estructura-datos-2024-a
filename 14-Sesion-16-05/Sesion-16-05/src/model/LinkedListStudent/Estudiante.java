package model.LinkedListStudent;

public class Estudiante {
    String nombre;
    Matricula primeraMatricula;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.primeraMatricula = null;
    }

    public void matricular(Materia materia) {
        if (primeraMatricula == null) {
            primeraMatricula = new Matricula(materia);
        } else {
            Matricula temp = primeraMatricula;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = new Matricula(materia);
        }
    }

    public void mostrarMatricula() {
        System.out.println("Matrícula de " + nombre + ":");
        Matricula temp = primeraMatricula;
        while (temp != null) {
            System.out.println("- " + temp.materia);
            temp = temp.siguiente;
        }
    }
}
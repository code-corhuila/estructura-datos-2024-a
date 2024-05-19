package model.LinkedListStudent;

public class Materia {
    String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
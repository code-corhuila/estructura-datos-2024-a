package model.LinkedListStudent;

public class Matricula {
    Materia materia;
    Matricula siguiente;

    public Matricula(Materia materia) {
        this.materia = materia;
        this.siguiente = null;
    }
}
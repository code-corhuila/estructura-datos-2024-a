package model.TreeCompany;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    String nombre;
    List<Empleado> subordinados;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado subordinado) {
        this.subordinados.add(subordinado);
    }

    public void mostrarJerarquia() {
        mostrarJerarquiaRec(this, 0);
    }

    private void mostrarJerarquiaRec(Empleado empleado, int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("  ");
        }
        System.out.println(espacio.toString() + empleado.nombre);
        for (Empleado subordinado : empleado.subordinados) {
            mostrarJerarquiaRec(subordinado, nivel + 1);
        }
    }
}
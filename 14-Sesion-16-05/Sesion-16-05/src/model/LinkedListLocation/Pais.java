package model.LinkedListLocation;

public class Pais {
    String nombre;
    Departamento primerDepartamento;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.primerDepartamento = null;
    }

    public void agregarDepartamento(Departamento departamento) {
        if (this.primerDepartamento == null) {
            this.primerDepartamento = departamento;
        } else {
            Departamento temp = this.primerDepartamento;
            while (temp.siguienteDepartamento != null) {
                temp = temp.siguienteDepartamento;
            }
            temp.siguienteDepartamento = departamento;
        }
    }

    public void mostrarDepartamentos() {
        if (this.primerDepartamento != null) {
            this.primerDepartamento.mostrarCiudades();
        }
    }
}
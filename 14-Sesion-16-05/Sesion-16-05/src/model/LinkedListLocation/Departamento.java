package model.LinkedListLocation;

public class Departamento {
    String nombre;
    Ciudad ciudad;
    Departamento siguienteDepartamento;

    public Departamento(String nombre) {
        this.nombre = nombre; // Asignamos un nombre al departamento
        this.ciudad = null;
        this.siguienteDepartamento = null;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (this.ciudad == null) {
            this.ciudad = ciudad;
        } else {
            Departamento temp = this;
            while (temp.siguienteDepartamento != null) {
                temp = temp.siguienteDepartamento;
            }
            Departamento nuevoDepartamento = new Departamento("");
            nuevoDepartamento.ciudad = ciudad;
            temp.siguienteDepartamento = nuevoDepartamento;
        }
    }

    public void mostrarCiudades() {
        Departamento temp = this;
        while (temp != null) {
            if (temp.nombre != null && !temp.nombre.isEmpty()) {
                System.out.println("Departamento: " + temp.nombre);
            }
            System.out.println("- " + temp.ciudad);
            temp = temp.siguienteDepartamento;
        }
    }
}
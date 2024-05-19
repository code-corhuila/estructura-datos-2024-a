package view.LinkedListLocation;
import model.LinkedListLocation.Ciudad;
import model.LinkedListLocation.Departamento;
import model.LinkedListLocation.Pais;
public class LinkedList {
    public static void main(String[] args) {
        // Crear países
        Pais colombia = new Pais("Colombia");
        Pais peru = new Pais("Perú");

        // Agregar departamentos a Colombia
        Departamento antioquia = new Departamento("Antioquia");
        antioquia.agregarCiudad(new Ciudad("Medellín"));
        antioquia.agregarCiudad(new Ciudad("Envigado"));
        colombia.agregarDepartamento(antioquia);

        Departamento boyaca = new Departamento("Boyacá");
        boyaca.agregarCiudad(new Ciudad("Tunja"));
        boyaca.agregarCiudad(new Ciudad("Duitama"));
        colombia.agregarDepartamento(boyaca);

        Departamento huila = new Departamento("Huila");
        huila.agregarCiudad(new Ciudad("Neiva"));
        huila.agregarCiudad(new Ciudad("Pitalito"));
        huila.agregarCiudad(new Ciudad("Garzón"));
        huila.agregarCiudad(new Ciudad("La Plata"));
        huila.agregarCiudad(new Ciudad("Campoalegre"));
        colombia.agregarDepartamento(huila);


        // Agregar departamentos a Perú
        Departamento lima = new Departamento("Lima");
        lima.agregarCiudad(new Ciudad("Lima"));
        lima.agregarCiudad(new Ciudad("Miraflores"));
        peru.agregarDepartamento(lima);

        Departamento arequipa = new Departamento("Arequipa");
        arequipa.agregarCiudad(new Ciudad("Arequipa"));
        arequipa.agregarCiudad(new Ciudad("Camaná"));
        peru.agregarDepartamento(arequipa);

        Departamento cusco = new Departamento("Cusco");
        cusco.agregarCiudad(new Ciudad("Cusco"));
        cusco.agregarCiudad(new Ciudad("Machu Picchu"));
        peru.agregarDepartamento(cusco);

        // Mostrar departamentos de Colombia y Perú
        System.out.println("Departamentos de Colombia:");
        colombia.mostrarDepartamentos();
        System.out.println("");

        System.out.println("Departamentos de Perú:");
        peru.mostrarDepartamentos();

    }
}

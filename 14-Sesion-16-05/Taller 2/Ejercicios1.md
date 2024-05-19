# Ejemplo 1

### Planteamiento del Ejercicio - Usar listas enlazadas

Se desea crear un sistema para gestionar la información geográfica de diferentes países, incluyendo la información de los departamentos y ciudades dentro de cada país. Para ello, se van a definir las siguientes clases:

#### 1. Clase `Ciudad`

Esta clase representa una ciudad y tiene un único atributo:

- `nombre`: Representa el nombre de la ciudad.

#### 2. Clase `Departamento`

Esta clase representa un departamento y tiene los siguientes atributos:

- `nombre`: Representa el nombre del departamento.
- `ciudad`: Representa la primera ciudad del departamento.
- `siguienteDepartamento`: Representa el siguiente departamento en la lista.

Además, tiene los siguientes métodos:

- `agregarCiudad(ciudad)`: Agrega una nueva ciudad al departamento.
- `mostrarCiudades()`: Muestra el nombre del departamento y todas las ciudades asociadas a él.

#### 3. Clase `Pais`

Esta clase representa un país y tiene los siguientes atributos:

- `nombre`: Representa el nombre del país.
- `primerDepartamento`: Representa el primer departamento del país.

Además, tiene los siguientes métodos:

- `agregarDepartamento(departamento)`: Agrega un nuevo departamento al país.
- `mostrarDepartamentos()`: Muestra todos los departamentos del país con sus respectivas ciudades.

#### 4. Clase `LinkedList`

Esta clase contiene el método `main` donde se crea la estructura de datos para representar la información geográfica de varios países, incluyendo sus departamentos y ciudades. Se crean varios países con sus respectivos departamentos y ciudades, y luego se muestra la información de los departamentos de Colombia y Perú.

```java
package model.LinkedListLocation;

public class Ciudad {
    String nombre;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
```

```java
package model.LinkedListLocation;

public class Departamento {
    String nombre;
    Ciudad ciudad;
    Departamento siguienteDepartamento;

    public Departamento(String nombre) {
        this.nombre = nombre; 
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
```

```java
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
```

```java
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
```
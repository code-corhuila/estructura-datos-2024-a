# Ejemplo 2

### Planteamiento del Ejercicio - Usar listas enlazadas

Se desea crear un sistema para gestionar la matrícula de estudiantes en diferentes materias. Para ello, se van a definir las siguientes clases:

#### 1. Clase `Materia`

Esta clase representa una materia y tiene un único atributo:

- `nombre`: Representa el nombre de la materia.

#### 2. Clase `Matricula`

Esta clase representa una matrícula de un estudiante en una materia y tiene los siguientes atributos:

- `materia`: Representa la materia matriculada.
- `siguiente`: Representa la siguiente matrícula en la lista.

#### 3. Clase `Estudiante`

Esta clase representa un estudiante y tiene los siguientes atributos:

- `nombre`: Representa el nombre del estudiante.
- `primeraMatricula`: Representa la primera matrícula del estudiante.

Además, tiene los siguientes métodos:

- `matricular(materia)`: Matricula al estudiante en una nueva materia.
- `mostrarMatricula()`: Muestra la matrícula del estudiante, es decir, todas las materias en las que está matriculado.

#### 4. Clase `LinkedList`

Esta clase contiene el método `main` donde se crea la estructura de datos para representar la matrícula de varios estudiantes en diferentes materias. Se crean varias materias y estudiantes, se matriculan los estudiantes en las materias correspondientes, y luego se muestra la matrícula de cada estudiante.

```java
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
```

```java
package model.LinkedListStudent;

public class Matricula {
    Materia materia;
    Matricula siguiente;

    public Matricula(Materia materia) {
        this.materia = materia;
        this.siguiente = null;
    }
}
```

```java
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
```

```java
package view.LinkedListStudent;

import model.LinkedListStudent.Estudiante;
import model.LinkedListStudent.Materia;

public class LinkedList {
    public static void main(String[] args) {
        // Crear materias
        Materia matematicas = new Materia("Matemáticas");
        Materia historia = new Materia("Historia");
        Materia ciencias = new Materia("Ciencias");
        Materia estructura = new Materia("Estructura de Datos");

        // Crear estudiantes
        Estudiante juan = new Estudiante("Juan");
        Estudiante maria = new Estudiante("Maria");
        Estudiante pedro = new Estudiante("Pedro");

        // Matricular estudiantes en materias
        juan.matricular(matematicas);
        juan.matricular(historia);
        maria.matricular(ciencias);
        pedro.matricular(estructura);
        pedro.matricular(historia);
        pedro.matricular(matematicas);

        // Mostrar matrícula de los estudiantes
        juan.mostrarMatricula();
        maria.mostrarMatricula();
        pedro.mostrarMatricula();
    }
}
```
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

import Class.Persona;
import Class.Estudiante;
import Class.Matricula;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona camilo = new  Persona();
        camilo.setId(1);
        camilo.setNombre("Camilo Barrera Giraldo");
        camilo.setCorreo("camilo@gmail.com");
        camilo.setEstado(true);
        // camilo.Mostrar();

        Persona danna = new  Persona();
        danna.setId(1);
        danna.setNombre("Danna Michelle Morales Losada");
        danna.setCorreo("andres@gmail.com");
        danna.setEstado(true);
        // danna.Mostrar();

        Persona angie = new  Persona();
        angie.setId(1);
        angie.setNombre("Angie Floréz");
        angie.setCorreo("andres@gmail.com");
        angie.setEstado(true);
        // angie.Mostrar();

        Estudiante e1 = new  Estudiante();
        e1.setId(2);
        e1.setCodigo("9010B");
        e1.setNumeroSemestre((byte)3);
        e1.setPersona(camilo);
        // e1.Mostrar();

        Estudiante e2 = new  Estudiante();
        e2.setId(2);
        e2.setCodigo("901012A");
        e2.setNumeroSemestre((byte)4);
        e2.setPersona(danna);
        // e2.Mostrar();

        Estudiante e3 = new  Estudiante();
        e3.setId(2);
        e3.setCodigo("901011B");
        e3.setNumeroSemestre((byte)5);
        e3.setPersona(angie);
        // e2.Mostrar();

        Matricula mm1 = new Matricula();
        mm1.setId(1);
        mm1.setMateria("Estructura de datos");
        mm1.setNota(2.5);
        mm1.setEstudiante(e1);
        mm1.Mostrar();

        Matricula mm2 = new Matricula();
        mm2.setId(1);
        mm2.setMateria("Cálculo Multivariado");
        mm2.setNota(4.5);
        mm2.setEstudiante(e1);
        mm2.Mostrar();

        Matricula mm3 = new Matricula();
        mm3.setId(1);
        mm3.setMateria("Estructura de datos");
        mm3.setNota(3.0);
        mm3.setEstudiante(e2);
        mm3.Mostrar();

        Matricula mm4 = new Matricula();
        mm4.setId(1);
        mm4.setMateria("Cálculo Multivariado");
        mm4.setNota(4.0);
        mm4.setEstudiante(e2);
        mm4.Mostrar();

        Matricula mm5 = new Matricula();
        mm5.setId(1);
        mm5.setMateria("Física");
        mm5.setNota(2.0);
        mm5.setEstudiante(e2);
        mm5.Mostrar();

    }
}
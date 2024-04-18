package Class;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String materia;
    private double nota;

    public Estudiante(){}
    public Estudiante(int codigo, String nombre, String materia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materia = materia;
    }
    public Estudiante(int codigo, String nombre, String materia, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

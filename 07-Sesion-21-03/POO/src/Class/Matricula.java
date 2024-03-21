package Class;

public class Matricula {
    private int id;
    private String materia;
    private Double nota;
    private Estudiante estudiante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void Mostrar(){
        System.out.print(getEstudiante().getPersona().getNombre()+" - "+getEstudiante().getCodigo()+ ". Materia: "+getMateria()+" => "+getNota()+"\n");
    }
}

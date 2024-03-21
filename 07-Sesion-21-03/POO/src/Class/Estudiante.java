package Class;
public class Estudiante {
    private int id;
    private String codigo;
    private Byte numeroSemestre;
    public Persona persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Byte getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(Byte numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void Mostrar(){
        System.out.print(getPersona().getNombre()+" - "+getCodigo()+" - Semestre "+getNumeroSemestre()+"\n");
    }
}

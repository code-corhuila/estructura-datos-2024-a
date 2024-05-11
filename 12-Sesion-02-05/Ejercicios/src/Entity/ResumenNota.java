package Entity;

public class ResumenNota {
    private String ResumenNota;
    private String CodigoEst;
    private String NombreEst;
    private String CodigoMat;
    private String NombreMat;
    private Double nota;



    public String getResumenNota() {
        return ResumenNota;
    }

    public void setResumenNota(String resumenNota) {
        ResumenNota = resumenNota;
    }

    public String getCodigoEst() {
        return CodigoEst;
    }

    public void setCodigoEst(String codigoEst) {
        CodigoEst = codigoEst;
    }

    public String getNombreEst() {
        return NombreEst;
    }

    public void setNombreEst(String nombreEst) {
        NombreEst = nombreEst;
    }

    public String getCodigoMat() {
        return CodigoMat;
    }

    public void setCodigoMat(String codigoMat) {
        CodigoMat = codigoMat;
    }

    public String getNombreMat() {
        return NombreMat;
    }

    public void setNombreMat(String nombreMat) {
        NombreMat = nombreMat;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    public void promedio(){

        System.out.println("El promedio de la nota es: "+nota);
    }
}

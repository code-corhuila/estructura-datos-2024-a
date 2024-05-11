import Entity.ResumenNota;

import javax.swing.*;

public class Ejecutar {
    public static void main(String[] args) {
        //numero de registros
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de registros"));
        ResumenNota resum[]=new ResumenNota[cantidad];
        for (int i=0; i< resum.length;i++){
            resum[i]=new ResumenNota();
            resum[i].setResumenNota(JOptionPane.showInputDialog(null, "Ingrese el resumen de la nota"));
            resum[i].setCodigoEst(JOptionPane.showInputDialog(null, "Ingrese el codigo del estudiante"));
            resum[i].setNombreEst(JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante"));
            resum[i].setCodigoMat(JOptionPane.showInputDialog(null, "Ingrese el codigo de la materia"));
            resum[i].setNombreMat(JOptionPane.showInputDialog(null, "Ingrese el nombre de la materia"));
            resum[i].setNota(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota")));
        }
        for (ResumenNota resumenNota : resum) {
            JOptionPane.showMessageDialog(null, resumenNota.getNombreEst()+" "+resumenNota.getCodigoEst()+" "+resumenNota.getNombreMat()+" "+
                    resumenNota.getCodigoMat()+" "+resumenNota.getNota());

        }
    }
}

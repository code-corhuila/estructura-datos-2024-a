package View;
import Class.Estudiante;

import javax.swing.*;

public class GestionEstudiante {
    public static void main(String[] Arg){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cantudad de estudiantes registra: "));
        Estudiante estudiante[] = new Estudiante[cantidad] ;

        for (int i = 0; i<estudiante.length; i++){
            estudiante[i] = new Estudiante();
            estudiante[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite codigo del estudiante "+i)));
            estudiante[i].setNombre(JOptionPane.showInputDialog(null,"Digite nombre del estudiante "+i));
            estudiante[i].setMateria(JOptionPane.showInputDialog(null,"Digite ,materia del estudiante "+i));
            estudiante[i].setNota(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite codigo del estudiante "+i)));
        }

        for (int i = 0; i<estudiante.length; i++){
            System.out.println(estudiante[i].getCodigo()+" "+estudiante[i].getNombre()+" "+estudiante[i].getMateria()+" "+estudiante[i].getNota());
        }
    }


}

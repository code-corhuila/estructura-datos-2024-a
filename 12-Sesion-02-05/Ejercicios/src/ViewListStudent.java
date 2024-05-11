import Entity.Student;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ViewListStudent {
    public static  void main(String[] args) {
        List<Student> Listestudiante = new ArrayList<Student>();
        String op="";
        do{
            op=JOptionPane.showInputDialog(null,"ingrese una opcion \n" +
                    "A. agregar datos\n" +
                    "B. mostrar datos\n" +
                    "C. salir" );
            switch (op.charAt(0)){
                case 'a': case 'A':
                    String nombre= JOptionPane.showInputDialog(null,"ingrese el nombre");
                    String codigo= JOptionPane.showInputDialog(null,"ingrese el codigo");
                    String segundoApellido= JOptionPane.showInputDialog(null,"ingrese el segundo apellido");
                    String telefono= JOptionPane.showInputDialog(null,"ingrese el telefono");
                    Listestudiante.add(new Student(nombre,codigo,segundoApellido,telefono));
                break;
                case 'b': case 'B':
                    for(int i=0;i<Listestudiante.size();i++){
                        System.out.println("codigo: "+Listestudiante.get(i).getCode()+" nombre: "+Listestudiante.get(i).getName()+" "+Listestudiante.get(i).getLastname()
                        +" telefono: "+ Listestudiante.get(i).getPhone());
                    }
                    break;

                case 'c': case 'C':
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"opcion invalida");
            }


        }while(!op.equalsIgnoreCase("C"));







    }
}

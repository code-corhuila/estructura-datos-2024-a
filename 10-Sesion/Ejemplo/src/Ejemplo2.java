import javax.swing.*;

public class Ejemplo2 {
    public static void main(String Arg[]){
        System.out.println("Primos");

        //Definir variables
        int cantidad = 0;
        int i = 0;
        int numero = 0;

        // Capturar el tamaño del array
        cantidad = Capturar("Digite el tamaño del vector");

        //Definir vector
        int data[] = new int[cantidad];

        int prueba[];

        //Llenar vector
        for(i=0; i<data.length;i++){
            //Capturar el dato
            numero = Capturar("Ingrese el número primo para la pos["+i+"]");
            boolean respuesta =  VerificarPrimo(numero);
            if(respuesta == true){
                data[i] = numero;
            }else{
                i--;
                JOptionPane.showMessageDialog(null,"Como el número ingresado no  es primo, se debe ingresar de nuevo");
            }

        }

        //Muestra
        for(i=0; i<data.length;i++){
            //Capturar el dato
            System.out.println(data[i]);
        }


    }

    public static int Capturar(String mensaje){
        int numero=0;
        while (numero <= 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje+":"));

            if(numero<=0){
                System.out.println("Solo cantidad positiva.");
            }
        }
        return  numero;
    }

    public static boolean VerificarPrimo(int numero){
        boolean respuesta = false;
        int contador=0;
        for(int i = 1; i<=numero; i++){
            if(numero % i == 0){
                contador++;
            }

        }
        if(contador == 2){
            respuesta=true;
        }

        return respuesta;
    }
}

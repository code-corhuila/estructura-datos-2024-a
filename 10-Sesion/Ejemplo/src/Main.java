public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String[] data = new String[3];
        data[0] = "h";
        data[1] = "hola";
        data[2] = "nuevo";
        //data[3] = "Buenos días";
        //data[4] = "Prueba";

        for (int i = 0; i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
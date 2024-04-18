
public class GestionEstudiante {
    
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Modificar estudiante por código");
            System.out.println("3. Eliminar estudiante por código");
            System.out.println("4. Consultar estudiante por código");
            System.out.println("5. Mostrar todos los estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    modificarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    consultarEstudiante();
                    break;
                case 5:
                    mostrarEstudiantes();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    static void registrarEstudiante() {
        System.out.print("Ingrese el código del estudiante: ");
        String codigo = scanner.next();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.next();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido, edad);
        listaEstudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante registrado correctamente.");
    }

    static void modificarEstudiante() {
        System.out.print("Ingrese el código del estudiante que desea modificar: ");
        String codigo = scanner.next();
        boolean encontrado = false;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.codigo.equals(codigo)) {
                System.out.print("Ingrese el nuevo nombre del estudiante: ");
                estudiante.nombre = scanner.next();
                System.out.print("Ingrese el nuevo apellido del estudiante: ");
                estudiante.apellido = scanner.next();
                System.out.print("Ingrese la nueva edad del estudiante: ");
                estudiante.edad = scanner.nextInt();
                encontrado = true;
                System.out.println("Estudiante modificado correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún estudiante con ese código.");
        }
    }

    static void eliminarEstudiante() {
        System.out.print("Ingrese el código del estudiante que desea eliminar: ");
        String codigo = scanner.next();
        boolean eliminado = false;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.codigo.equals(codigo)) {
                listaEstudiantes.remove(estudiante);
                eliminado = true;
                System.out.println("Estudiante eliminado correctamente.");
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró ningún estudiante con ese código.");
        }
    }

    static void consultarEstudiante() {
        System.out.print("Ingrese el código del estudiante que desea consultar: ");
        String codigo = scanner.next();
        boolean encontrado = false;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.codigo.equals(codigo)) {
                System.out.println("Nombre: " + estudiante.nombre);
                System.out.println("Apellido: " + estudiante.apellido);
                System.out.println("Edad: " + estudiante.edad);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún estudiante con ese código.");
        }
    }

    static void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Código: " + estudiante.codigo);
            System.out.println("Nombre: " + estudiante.nombre);
            System.out.println("Apellido: " + estudiante.apellido);
            System.out.println("Edad: " + estudiante.edad);
            System.out.println("----------------------");
        }
    }
}

package view.TreeCompany;

import model.TreeCompany.Empleado;

public class Empresa {
    public static void main(String[] args) {
        // Crear empleados
        Empleado ceo = new Empleado("Juan (CEO)");
        Empleado gerenteTI = new Empleado("Karol (Gerente de TI)");
        Empleado gerenteVentas = new Empleado("María (Gerente de Ventas)");
        Empleado gerenteProduccion = new Empleado("Carlos (Gerente de Producción)");
        Empleado supervisor1 = new Empleado("Ana (Supervisor 1)");
        Empleado supervisor2 = new Empleado("Pedro (Supervisor 2)");
        Empleado supervisor3 = new Empleado("Luisa (Supervisor 3)");
        Empleado vendedor1 = new Empleado("Sara (Vendedor 1)");
        Empleado vendedor2 = new Empleado("Luis (Vendedor 2)");
        Empleado operario1 = new Empleado("Elena (Operario 1)");
        Empleado operario2 = new Empleado("Diego (Operario 2)");
        Empleado developer1 = new Empleado("Jorge (Desarrollador 1)");
        Empleado developer2 = new Empleado("Marcela (Desarrollador 2)");
        Empleado tester1 = new Empleado("Miguel (Tester 1)");
        Empleado tester2 = new Empleado("Laura (Tester 2)");
        Empleado analista1 = new Empleado("Andrés (Analista 1)");
        Empleado pasante1 = new Empleado("Camila (Pasante 1)");
        Empleado pasante2 = new Empleado("Esteban (Pasante 2)");
        Empleado pasante3 = new Empleado("Valeria (Pasante 3)");

        // Construir la jerarquía
        ceo.agregarSubordinado(gerenteVentas);
        ceo.agregarSubordinado(gerenteProduccion);
        ceo.agregarSubordinado(gerenteTI);
        gerenteVentas.agregarSubordinado(supervisor1);
        gerenteVentas.agregarSubordinado(supervisor2);
        gerenteTI.agregarSubordinado(supervisor3);
        supervisor1.agregarSubordinado(vendedor1);
        supervisor1.agregarSubordinado(vendedor2);
        gerenteProduccion.agregarSubordinado(operario1);
        gerenteProduccion.agregarSubordinado(operario2);
        supervisor3.agregarSubordinado(developer1);
        supervisor3.agregarSubordinado(developer2);
        developer1.agregarSubordinado(tester1);
        developer1.agregarSubordinado(tester2);
        developer1.agregarSubordinado(analista1);
        tester1.agregarSubordinado(pasante1);
        tester1.agregarSubordinado(pasante2);

        // Mostrar jerarquía de la organización
        System.out.println("Jerarquía de la organización:");
        ceo.mostrarJerarquia();
    }
}

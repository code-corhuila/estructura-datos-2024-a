import Entity.Person;
import Entity.Person2;
import Entity.Product;

public class Main {
    public static void main(String[] args) {

        // Person person = new Person();
        Person person = new Person();
        person.setName("John");
        person.setSurname("Doe");
        person.setEmail("jhon23@gmail.com");
        person.save();

        // Product product = new Product();
        Product product = new Product();
        product.setCode("123");
        product.setName("Laptop");
        product.setDescription("Laptop Lenovo");
        product.setPrice(1000.0);
        product.setStock(10);
        product.save();
    }

    // Al finalizar generar las listar de cada entidad.
    /***
     * ListPerson
     * ListProduct
     * ListCatergoria
     * ListFactura
     * ListDetalleFactura
     *
     * Crear un ciclo con finalización controlada por el usuario, que permita llenar la lista elegida.
     * ***/
    Person2 person = new Person2();
    for (int i = 0; i<=10; i++){
        person.setName("John");
        person.setSurname("Doe");
        person.setEmail("sdasd@prueba.com");

        //Llenar lista
        List<DataPersona> Data = person2.add(person);
    }
}
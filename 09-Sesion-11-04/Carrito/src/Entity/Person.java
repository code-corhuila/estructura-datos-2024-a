package Entity;

import java.util.List;
import java.util.Optional;

public class Person extends ABaseEntity<Person>{
    private String name;
    private String surname;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void save() {
        System.out.println("Person saved");
    }

    @Override
    public void update(Long id) {
        System.out.println("Person updated");
    }

    @Override
    public void delete(Long id) {
        System.out.println("Person deleted");
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Optional<Person> findById(Long id) {
        return Optional.empty();
    }
}

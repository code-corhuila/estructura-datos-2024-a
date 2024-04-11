package Entity;

import java.util.List;
import java.util.Optional;

public class Product extends ABaseEntity<Product>{
    private String code;
    private String name;
    private String description;
    private Double price;
    private Integer stock;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public void save() {
        System.out.println("Producto saved");
    }

    @Override
    public void update(Long id) {
        System.out.println("Producto updated");
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }
}

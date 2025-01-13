package product_management;

public class Product {
    private String id;
    private String name;
    private double price;
    private String description;
    private String manufacturer;

    public Product(String id, String name, double price, String description, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Price: %.2f, Description: %s, Manufacturer: %s", id, name, price, description, manufacturer);
    }

    public String getId() {
        return id;
    }

    public String toFileString() {
        return id + "," + name + "," + price + "," + description + "," + manufacturer;
    }

    public static Product fromFileString(String fileString) {
        String[] parts = fileString.split(",", 5);
        return  new Product(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3], parts[4]);
    }
}

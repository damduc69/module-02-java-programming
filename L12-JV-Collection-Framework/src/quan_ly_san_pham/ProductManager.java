package quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private static List<Product> products;


    public ProductManager() {
        products = new ArrayList<>();
     // products = new LinkedList<>(); //Linkedlist
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void updateProduct(int id, String name, double price) {
        for (Product p : products) {
            if(p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                return;
            }
        }
        System.out.println("Product not found");
    }

    public static void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public static void displayProduct() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void searchProductByName(String name) {
        for (Product p : products) {
            if(p.getName().contains(name)) {
                System.out.println(p);
            }
        }
    }

    public void sortProductByAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductByDescending() {
        products.sort((p1,p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}

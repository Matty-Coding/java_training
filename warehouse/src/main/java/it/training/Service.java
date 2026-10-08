package it.training;

import java.util.ArrayList;
import java.util.Optional;

public class Service {

    /**
     * Calculate total price of a product based on quantity
     * 
     * @param products
     * @return {@code (double) totalWarehousePrice}
     */
    public double calculateTotalWarehousePrice(Product[] products) {
        double totalWarehousePrice = 0;
        for (Product product : products) {
            totalWarehousePrice += product.getPrice() * product.getQuantity();
        }
        return totalWarehousePrice;
    }

    /**
     * Find product by id, return empty optional if not found
     * 
     * @param products array of products
     * @param id       product id
     * @return {@code Product}
     */
    public Optional<Product> findProductById(Product[] products, String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public ArrayList<Product> addProduct(ArrayList<Product> products, Product product) {
        products.add(product);
        return products;
    }

    public ArrayList<Product> removeProduct(ArrayList<Product> products, Product product) {
        products.remove(product);
        return products;
    }

    public void showProducts(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

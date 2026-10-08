package it.training.app;

import java.util.ArrayList;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        // add products
        products.add(new Product("1", "IPhone 11", 999.99, 10));
        products.add(new Product("2", "IPhone 11 Pro", 1999.99, 10));
        products.add(new Product("3", "IPhone 11 Pro Max", 2999.99, 10));

        Service service = new Service();
        Input input = new Input();

        while (true) {

            System.out.println("\n =====  WAREHOUSE  ==== \n");
            System.out.println("[1] - Add Product");
            System.out.println("[2] - Swow all products");
            System.out.println("[3] - Find product by ID");
            System.out.println("[4] - Calculate total warehouse");
            System.out.println("[0] - Exit");

            String userInput = input.getString("\nChoice an option: ");

            if (userInput.equals("0")) {
                input.close();
                System.out.println("Goodbye!");
                break;
            }

            switch (userInput) {
                case "1":
                    String productId = input.getString("Product ID: ");
                    String productName = input.getString("Product Name: ");
                    double productPrice = input.getDouble("Product Price: ");
                    int productQuantity = input.getInt("Product Quantity: ");

                    Product product = new Product(productId, productName, productPrice, productQuantity);
                    products = service.addProduct(products, product);

                    System.out.println("Product added successfully!");
                    break;

                case "2":
                    service.showProducts(products);
                    break;

                case "3":
                    String id = input.getString("Product ID: ");
                    Optional<Product> productOptional = service.findProductById(products.toArray(new Product[0]), id);
                    if (productOptional.isPresent()) {
                        System.out.println(productOptional.get());
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case "4":
                    double totalWarehousePrice = service.calculateTotalWarehousePrice(products.toArray(new Product[0]));
                    System.out.println("Total warehouse price: " + totalWarehousePrice);
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}

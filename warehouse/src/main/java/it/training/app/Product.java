package it.training.app;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    // constructor
    Product(String id, String name, double price, int quantity) {
        if (!isValid())
            throw new IllegalArgumentException("Cannot create product. Price and quantity must be >= 0");

        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Check if price and quantity are valid
     * 
     * @return true if price and quantity are valid
     */
    private boolean isValid() {
        return price >= 0 && quantity >= 0;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}

// Product.java
public class Product
 {
    // Attributes
    private String name;
    private String productID;
    private double price;
    private int stockQuantity;
    private String category;
    private String supplierName;
    private String expirationDate;

    // Default Constructor
    public Product()
    {
    
    }

    // Parameterized Constructor
    public Product(String name, String productID, double price, int stockQuantity, String category, String supplierName, String expirationDate) {
        this.name = name;
        this.productID = productID;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.supplierName = supplierName;
        this.expirationDate = expirationDate;
    }

    // Setter and Getter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductID() {
        return productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    // Method to display product details
    public void showDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Category: " + category);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Expiration Date: " + expirationDate);
    }

    // Custom method to apply discount
    public double applyDiscount(double discountPercentage) {
        double discountAmount = price * (discountPercentage / 100);
        price -= discountAmount;
        return price;
    }
}

// Start.java
public class Start {
    public static void main(String[] args) {
        // Creating two sample product objects
        Product product1 = new Product("Laptop", "P1001", 1200.00, 50, "Electronics", "Tech Supplies Inc.", "N/A");
        Product product2 = new Product("Milk", "P2001", 3.50, 200, "Grocery", "Dairy Co.", "2025-06-15");

        // Displaying details of each product
        System.out.println("Product 1 Details:");
        product1.showDetails();
        System.out.println("Applying 10% discount on Product 1...");
        System.out.println("Discounted Price: $" + product1.applyDiscount(10));
        
        System.out.println("\nProduct 2 Details:");
        product2.showDetails();
        System.out.println("Applying 5% discount on Product 2...");
        System.out.println("Discounted Price: $" + product2.applyDiscount(5));
    }
}
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void show() {
        System.out.println("Product: " + name + ", Price: Rs." + price + ", Quantity: " + quantity);
    }

    public int updateQuantity(String name, int newQuantity) {
        quantity = newQuantity;
        return newQuantity;
    }

    public int updatePrice(String namePro, int newPrice) {
        price = newPrice;
        return newPrice;
    }
}

public class BasicInventory {
    public static void main(String[] args) {
        Product obj = new Product("English-Book", 198.75, 20);
        Product obj1 = new Product("Math-Book", 225.75, 25);
        Product obj2 = new Product("Hindi-Book", 199.75, 40);
        Product obj3 = new Product("Science-Book", 250.50, 30);
        Product obj4 = new Product("Computer-Book", 325.25, 35);
        // Invention o = new Invention(null, 0, 0);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a valid option...");
            System.out.println("1. Current inventory");
            System.out.println("2. Update quantity");
            System.out.println("3. Update price");
            System.out.println("4. Add a product");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.show();
                    obj1.show();
                    obj2.show();
                    obj3.show();
                    obj4.show();
                    break;
                case 2:
                    System.out.println("Enter Product name: ");
                    String name = sc.next();
                    System.out.println("Enter new Quantity: ");
                    int newQuantity = sc.nextInt();
                    switch (name) {
                        case "English-Book":
                            obj.updateQuantity(name, newQuantity);
                            break;
                        case "Math-Book":
                            obj1.updateQuantity(name, newQuantity);
                            break;
                        case "Hindi-Book":
                            obj2.updateQuantity(name, newQuantity);
                            break;
                        case "Science-Book":
                            obj3.updateQuantity(name, newQuantity);
                            break;
                        case "Computer-Book":
                            obj4.updateQuantity(name, newQuantity);
                            break;

                        default:
                            System.out.println("Invalid product name!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter Product name: ");
                    String namePro = sc.next();
                    System.out.println("Enter new Price: ");
                    int newPrice = sc.nextInt();
                    switch (namePro) {
                        case "English-Book":
                            obj.updatePrice(namePro, newPrice);
                            break;
                        case "Math-Book":
                            obj1.updatePrice(namePro, newPrice);
                            break;
                        case "Hindi-Book":
                            obj2.updatePrice(namePro, newPrice);
                            break;
                        case "Science-Book":
                            obj3.updatePrice(namePro, newPrice);
                            break;
                        case "Computer-Book":
                            obj4.updatePrice(namePro, newPrice);
                            break;

                        default:
                            System.out.println("Invalid product name!");
                            break;
                    }
                    break;
                case 4:
                      System.out.println("Enter product name");
                      String n = sc.next();
                      System.out.println("Enter price");
                      double p = sc.nextInt();
                      System.out.println("Enter qantity");
                      int q = sc.nextInt();
                      Product o = new Product(n, p, q);
                      o.show();
                      System.out.println("Product added successfully!");
                    break;
                case 5:
                    System.out.println("Exiting, Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, enter valid option");
                    sc.close();
                    break;
            }
        }
    }
}

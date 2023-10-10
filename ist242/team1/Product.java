package ist242.team1;



import java.util.Scanner;

/** Class used to create Product object for the storefront. It stores information about the product.
 * @author Team1
 * @version 1
 *
 */
public class Product {
    private int productId;
    private String name;
    private String brand;
    private Type type;
    private Color color;
    private Size size;
    private double price;
    private Material material;
    private int quantity;

    /**
     * Way to add static product. Might not be used in later versions.
     * @param productId Unique productID
     * @param name name of product
     * @param brand brand of product
     * @param type type of product
     * @param color color of product
     * @param size size of product
     * @param material material of product
     * @param price price of product
     * @param quantity quantity of product
     */
    public Product(int productId, String name, String brand, Type type, Color color, Size size, Material material, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
    }

    /**
     * Uses user input to add shoe details
     */
    public Product(){

    }

    /**
     * Enums representing Size
     * Constants to relate to size of shoe
     */
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    /**
     * Enums representing type of shoe.
     *
     */
    public enum Type {
        RUNNING_SHOES, DRESS_SHOES, BOOTS
    }
    /**
     * Enums representing Color of shoe
     *
     */
    public enum Color {
        RED, BLACK, WHITE, BLUE
    }
    /**
     * Enums representing Material
     *
     */
    public enum Material {
        SYNTHETIC_LEATHER, RUBBER, POLYESTER
    }


    /**
     * returns string of a Product
     * @return A string containing the product's name, price, and quantity
     */
    public String toString() {
        return "Product Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }

    /**
     * Getter method for ProductId
     * @return the productId of product
     */
    public int getProductId(){
        return productId;
    }

    /**
     * Method to update the quantity of an item
     * @param quantity the new quantity
     */
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

    /**
     * Method to update Price of shoe
     * @param newPrice the new price
     */
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Method to Update size of product
     * @param newSize the new Size of product
     */
    public void changeSize(Size newSize) {
        this.size = newSize;
    }

    /**
     * Method to change the color of product
     * @param newColor the new Color of product
     */
    public void changeColor(Color newColor) {
        this.color = newColor;
    }

    /**
     * Updates Material
     * @param newMaterial the new material of product
     */
    public void updateMaterial(Material newMaterial) {
        this.material = newMaterial;
    }

    /**
     * Asks User for product information
     */
    public void promptUserProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Product Id: ");
        productId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Product Name: ");
        name = scan.nextLine();
        System.out.println("Enter Product Brand: ");
        brand = scan.nextLine();
        System.out.println("Enter Product Type (RUNNING_SHOES, DRESS_SHOES, BOOTS): ");
        type = Type.valueOf(scan.nextLine());
        System.out.println("Enter Product Color (RED, BLACK, WHITE, BLUE): ");
        color = Color.valueOf(scan.nextLine());
        System.out.println("Enter Product Size (SMALL, MEDIUM, LARGE): ");
        size = Size.valueOf(scan.nextLine());
        System.out.println("Enter Product Material (SYNTHETIC_LEATHER, RUBBER, POLYESTER): ");
        material = Material.valueOf(scan.nextLine());
        System.out.println("Enter Product Price: ");
        price = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Product Quantity: ");
        quantity = scan.nextInt();
        scan.nextLine();
    }
    }



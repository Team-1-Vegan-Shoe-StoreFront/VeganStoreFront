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
     * Just another way to add Products if we wanted. Might not be used in later versions.
     * @param productId
     * @param name
     * @param brand
     * @param type
     * @param color
     * @param size
     * @param material
     * @param price
     * @param quantity
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

    public String toString() {
        return "Product Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }
    public int getProductId(){
        return productId;
    }

    /**
     * Method to update the Quantity of an item
     * @param quantity
     */
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

    /**
     * Method to update Price of shoe
     * @param newPrice
     */
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Method to Update sie of shoe
     * @param newSize
     */
    public void changeSize(Size newSize) {
        this.size = newSize;
    }

    /**
     * Method to Update Color
     * @param newColor
     */
    public void changeColor(Color newColor) {
        this.color = newColor;
    }

    /**
     * Updates Material
     * @param newMaterial
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



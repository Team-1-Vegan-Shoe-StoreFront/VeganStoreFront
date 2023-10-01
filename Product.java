import java.util.Scanner;

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
    public Product(){

    }

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public enum Type {
        RUNNING_SHOES, DRESS_SHOES, BOOTS
    }

    public enum Color {
        RED, BLACK, WHITE, BLUE
    }

    public enum Material {
        SYNTHETIC_LEATHER, RUBBER, POLYESTER
    }

    public String toString() {
        return "Product Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }
    public int getProductId(){
        return productId;
    }
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }


    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeSize(Size newSize) {
        this.size = newSize;
    }

    public void changeColor(Color newColor) {
        this.color = newColor;
    }

    public void updateMaterial(Material newMaterial) {
        this.material = newMaterial;
    }


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



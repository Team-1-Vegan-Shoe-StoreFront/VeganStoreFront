package ist242.team1;
import java.util.Scanner;

/**
 * Entry point for project
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
/**
 * Creating predefined product
 * Adds the predefined product to the inventory
 */
        Product product = new Product(1, "Bludstone Black Vegan Boots", "Bludstone", Product.Type.BOOTS, Product.Color.BLACK, Product.Size.MEDIUM, Product.Material.SYNTHETIC_LEATHER, 209.99, 10);
        System.out.println(product.toString());
        inventory.addProduct(product);
        System.out.println(inventory.getAllProducts());

/**
 * Uses user input for a new Product and displays it
 */
        Product userInputProduct = new Product();
        userInputProduct.promptUserProduct();
        System.out.println("User Input Product: " + userInputProduct.toString());



    }}

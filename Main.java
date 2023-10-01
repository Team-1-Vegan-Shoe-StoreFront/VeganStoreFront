import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product = new Product(1, "Bludstone Black Vegan Boots", "Bludstone", Product.Type.BOOTS, Product.Color.BLACK, Product.Size.MEDIUM, Product.Material.SYNTHETIC_LEATHER, 209.99, 10);
        System.out.println(product.toString());
        inventory.addProduct(product);
        System.out.println(inventory.getAllProducts());


        Product userInputProduct = new Product();
        userInputProduct.promptUserProduct();
        System.out.println("User Input Product: " + userInputProduct.toString());



    }}

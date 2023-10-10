package ist242.team1;
import java.util.ArrayList;
import java.util.List;

/**
 * Inventory class which represents a group of products
 * allows adding and getting products from a list of all products
 */

public class Inventory {
    private List<Product> products;

    /**
     * Makes a new empty Inventory
     */
    public Inventory() {
        products = new ArrayList<>();
    }

    /**
     * Adds product to Inventory
     * @param product The product added to Inventory
     */
    public void addProduct(Product product) {
        products.add(product);
    }


    /**
     * A list of all products in the inventory.
     * @return products
     */
    public List<Product> getAllProducts() {
        return products;
    }
}
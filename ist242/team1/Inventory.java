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
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }


    /**
     *
     * @return A list of all products in the inventory.
     */
    public List<Product> getAllProducts() {
        return products;
    }
}
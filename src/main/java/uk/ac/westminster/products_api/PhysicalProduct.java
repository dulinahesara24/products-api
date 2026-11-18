package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is still an item in the catalogue with an id, name and price, it just gets shipped instead of downloaded.
// A ShoppingCart would not pass this test because a cart is not a product, it HAS products, so it should hold a List<Product> field instead of extending Product.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
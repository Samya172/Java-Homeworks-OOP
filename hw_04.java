
public class hw_04 {

    static void filterProducts(String category) {
        System.out.println("Searching by category: " + category);
    }

    static void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching by price: $" + minPrice
                + " to $" + maxPrice);
    }

    static void filterProductsByBrand(String brand) {
        System.out.println("Searching by brand: " + brand);
    }

    static void filterProducts(String category,
                               double minPrice, double maxPrice) {
        System.out.println("Category: " + category
                + ", Price: $" + minPrice + " to $" + maxPrice);
    }

    static void filterProducts(String category,
                               double minPrice, double maxPrice,
                               String brand) {
        System.out.println("Category: " + category
                + ", Price: $" + minPrice + " to $" + maxPrice
                + ", Brand: " + brand);
    }

    public static void main(String[] args) {

        filterProducts("Electronics");
        filterProducts(100, 500);
        filterProductsByBrand("Apple");
        filterProducts("Electronics", 100, 500);
        filterProducts("Electronics", 100, 500, "Apple");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

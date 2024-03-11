import product.ProductController;
import product.ProductModel;

public class Main {
    public static void main(String[] args) {
        ProductController products = new ProductController();
        try {
            products.create(new ProductModel("3NMKJ34KKM42KMOK3", "Rosas", 10, 2));
            products.create(new ProductModel("4NMKJ34KKM42KMOK3", "Maca", 300, 2));
            products.create(new ProductModel("5NMKJ34KKM42KMOK3", "Banana", 20, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        products.read();

        try {
            products.retrievePrice("3NMKJ34KKM42KMOK3");
            products.retrievePrice("Barcoideerrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
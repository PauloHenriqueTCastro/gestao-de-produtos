package product;

public class ProductModel {

    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;

    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

package product;

import java.util.ArrayList;

import exeptions.AlreadyExistsException;
import exeptions.NegativePriceException;
import exeptions.NotFoundException;

public class ProductController {
    // ProductModel product = new ProductModel(null, null, 0, 0);
    private ArrayList<ProductModel> products = new ArrayList<ProductModel>();

    public void create(ProductModel product) throws Exception {
        for (ProductModel productModel : products) {
            if (productModel.getBarCode() == product.getBarCode()) {
                throw new AlreadyExistsException();
            }
        }
        if ((product.getPriceInCents()) < 0) {
            throw new NegativePriceException("O preço do produto precisa ser um número positivo");
        }
        products.add(product);
        System.out.println("Produto " + product.getName() + " adicionado.");
    }

    public void read() {
        for (ProductModel productModel : products) {
            System.out.println(String.format("Produto: %s, Preco: %d, Stock: %d.", productModel.getName(),
                    productModel.getPriceInCents(), productModel.getStock()));
        }
    }

    public void retrievePrice(String barCode) throws Exception {
        for (ProductModel productModel : products) {
            if (productModel.getBarCode() == barCode) {
                System.out.println(String.format("Price %d", productModel.getPriceInCents()));
                break;
            } else {
                throw new NotFoundException(String.format("Product %s not found.", barCode));
            }
        }

    }
}

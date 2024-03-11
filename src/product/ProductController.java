package product;

import java.util.ArrayList;

public class ProductController {
    private ArrayList products = new ArrayList<ProductModel>();

    public String createProduct(ArrayList<ProductModel> producut) {
        // Criar um produto
        return "Produto 'nomeDoProduto' adicionado.";
    }
}

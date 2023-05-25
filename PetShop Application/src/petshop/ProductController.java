package petshop;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class ProductController {
    private ProductView view;
    private ProductDAO model;
    private int id;
    
    public ProductController(ProductView view) {
        this.view = view;
        this.model = new ProductDAO();
        
        view.addProductButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
        
        view.addUpdateButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateProduct();
            }
        });
        
        view.addDeleteButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteProduct();
            }
        });
        
        updateProductTable();
    }
    
    public void addProduct() {
        String name = view.getProductName();
        double price = view.getProductPrice();
        int quantity = view.getProductQuantity();
        
        Product product = new Product(id, name, price, quantity);
        model.addProduct(product);
        
        updateProductTable();
    }
    
    public void updateProduct() {
        int id = view.getProductId();
        String name = view.getProductName();
        double price = view.getProductPrice();
        int quantity = view.getProductQuantity();
        
        Product product = new Product(id, name, price, quantity);
        model.updateProduct(product);
        
        updateProductTable();
    }
    
    public void deleteProduct() {
        int id = view.getProductId();
        model.deleteProduct(id);
        
        updateProductTable();
    }
    
    private void updateProductTable() {
        List<Product> products = model.getAllProducts();
        view.setProductList(products);
    }
}


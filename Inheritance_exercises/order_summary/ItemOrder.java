import products.Products;

public class ItemOrder {
    public Products product;
    public int quantity;
    public ItemOrder(Products product, int quantity){
        this.product = product;
        this.quantity =  quantity;
    }
}


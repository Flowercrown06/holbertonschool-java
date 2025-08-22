

public class Order {
     double discountPercentage;
     ItemOrder[] items;
    public Order(double discountPercentage, ItemOrder[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (ItemOrder item : items) {
            total += item.quantity * item.product.getNetPrice();
        }
        total -= total * (discountPercentage / 100);
        return total;
    }
}

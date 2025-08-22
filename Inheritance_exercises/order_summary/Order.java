ppublic class Order {
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

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");
        for (ItemOrder item: items) {
            System.out.printf(String.format("Type: %s  Title: %s  Price: %.2f  Quant: 1  Total: %.2f\n", (item.product.getClass() + "").split("\\.")[1], item.product.title, item.product.getNetPrice(), item.product.getNetPrice() * item.quantity).replace(".", ","));
        }

        System.out.println("----------------------------");
        System.out.printf(String.format("DISCOUNT: %.2f\n", discount).replace(".", ","));
        System.out.printf(String.format("TOTAL PRODUCTS: %.2f\n", totalPrice).replace(".", ","));
        System.out.println("----------------------------");
        System.out.printf(String.format("TOTAL ORDER: %.2f\n", totalPrice - discount).replace(".", ","));
        System.out.println("----------------------------");
    }
}

import java.util.HashSet;

public class Order {
    private HashSet<OrderItem> itemsInBox = new HashSet<>();
    private HashSet<OrderItem> itemsOutOfBox = new HashSet<>();

    public void addItemInBox(OrderItem item) {
        itemsInBox.add(item);
    }

    public void addItemOutOfBox(OrderItem item) {
        itemsOutOfBox.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Out of the Box:\n");
        for (OrderItem item : itemsOutOfBox) {
            sb.append("        - ").append(item).append("\n");
        }
        sb.append("In the Box:\n");
        for (OrderItem item : itemsInBox) {
            sb.append("        - ").append(item).append("\n");
        }
        return sb.toString();
    }
}

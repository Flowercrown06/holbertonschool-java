

import org.example.snackshop.enums.OrderItemType;

public class OrderItem {
    private OrderItemType type;
    private String name;

    public OrderItem(OrderItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public OrderItemType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;
        OrderItem that = (OrderItem) o;
        return type == that.type && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return type.hashCode() + name.hashCode();
    }
}

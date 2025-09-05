
import providers.Shipping;

public class Order {

    private int code;
    private double weight ;
    private double total;
    private Shipping shipping;

    public Order(int code, double weight, double total) {
        this.code = code;
        this.weight = weight;
        this.total = total;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", weight=" + weight +
                ", total=" + total +
                ", shipping=" + shipping +
                '}';
    }
}

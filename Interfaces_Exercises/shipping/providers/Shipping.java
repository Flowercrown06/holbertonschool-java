package providers;

public class Shipping {
    private double value;
    private  ShippingProviderType shippingProviderType;

    public Shipping(double value, ShippingProviderType shippingProviderType) {
        this.value = value;
        this.shippingProviderType = shippingProviderType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public ShippingProviderType getShippingProviderType() {
        return shippingProviderType;
    }

    public void setShippingProviderType(ShippingProviderType shippingProviderType) {
        this.shippingProviderType = shippingProviderType;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "value=" + value +
                ", shippingProviderType=" + shippingProviderType +
                '}';
    }
}

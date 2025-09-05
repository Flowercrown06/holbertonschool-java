package shipping.providers;

public interface ShippingProvider {
    public Shipping calculateShipping(double weight, double value);
    ShippingProviderType getShippingProviderType();

}

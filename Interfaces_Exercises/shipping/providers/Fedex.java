package providers;

public class Fedex implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        if(weight > 1000.0) return new Shipping((value*0.1), getShippingProviderType());
        return new Shipping(value*0.05, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}

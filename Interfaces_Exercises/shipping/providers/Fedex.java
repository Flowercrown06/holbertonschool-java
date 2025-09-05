package providers;

public class Fedex implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double weightInKg = weight / 1000.0;
        if(weightInKg > 1) return new Shipping((value*0.1), getShippingProviderType());
        return new Shipping(value*0.5, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}

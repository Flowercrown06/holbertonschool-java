package providers;

public class UnitedParcelService implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double weightInKg = weight / 1000.0;
        if(weightInKg > 2) return new Shipping((value*0.7), getShippingProviderType());
        return new Shipping(value*0.45, getShippingProviderType());    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}

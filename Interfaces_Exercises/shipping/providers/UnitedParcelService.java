package providers;

public class UnitedParcelService implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        if(weight>2) return new Shipping((value*0.7), getShippingProviderType());
        return new Shipping(value*0.45, getShippingProviderType());    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}

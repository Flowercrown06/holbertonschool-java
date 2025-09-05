package shipping.providers;

public class DalseyHillblomLynn implements  ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        if(weight>5) return new Shipping((value*0.12), getShippingProviderType());
        return new Shipping(value*0.04, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}

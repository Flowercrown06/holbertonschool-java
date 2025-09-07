

public class CookieOrder {
    private String flavor;
    private int boxQuantity;

    public CookieOrder(String flavor, int boxQuantity) {
        this.flavor = flavor;
        this.boxQuantity = boxQuantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getBoxQuantity() {
        return boxQuantity;
    }

    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }
}

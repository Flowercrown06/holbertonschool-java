

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<CookieOrder> cookies = new ArrayList<>();

    public List<CookieOrder> getCookies() {
        return cookies;
    }

    public void setCookies(List<CookieOrder> cookies) {
        this.cookies = cookies;
    }

    public Order() {
        this.cookies = cookies;
    }

    public void addCookieOrder(CookieOrder cookieOrder){
        cookies.add(cookieOrder);
    }
    public int getTotalBoxes(){
        int total =  0;
        for(CookieOrder c : cookies){
            total+= c.getBoxQuantity();
        }
        return total;
    }

    public int removeFlavor(String flavor) {
        int totalBoxes = getTotalBoxes();
        cookies.removeIf(c -> c.getFlavor().equalsIgnoreCase(flavor));
        return totalBoxes - getTotalBoxes();
    }

}

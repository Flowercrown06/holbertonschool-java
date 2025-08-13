
public class Square {
    public static double area(double side){
        if (side > 0) {
            return side*4;
        } throw new IllegalArgumentException("Side must have a positive value.");
    }
}

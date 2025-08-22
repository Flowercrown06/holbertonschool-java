package complete_rectangle;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        this.side = 0;
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be greater than or equal to 0");
        }
        this.side = side;
        this.width = side;
        this.height = side;
    }

    @Override
    public String toString() {
        return String.format("[Square] %.2f", side);
    }
}

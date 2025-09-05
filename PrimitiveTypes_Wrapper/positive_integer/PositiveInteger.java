
// PositiveInteger.java
public class PositiveInteger {

    private int value;

    // Constructor int ilə
    public PositiveInteger(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = value;
    }

    // Constructor String ilə
    public PositiveInteger(String strValue) {
        try {
            int intValue = Integer.parseInt(strValue);
            if (intValue <= 0) {
                throw new IllegalArgumentException("Value is not a positive integer");
            }
            this.value = intValue;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
    }

    public int getValue() {
        return value;
    }

    // Dəyəri dəyişmək üçün metod
    public void setValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = value;
    }

    // Prime olub olmadığını yoxlayan metod
    public boolean isPrime() {
        if (value <= 1) return false;
        if (value == 2) return true;

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

// Program.java
public class Program {
    public static void main(String[] args) {
        try {
            PositiveInteger positiveInteger = new PositiveInteger("1");
            System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        PositiveInteger positiveInteger1 = null;

        try {
            positiveInteger1 = new PositiveInteger("43");
            System.out.println(positiveInteger1.getValue() + " - " + positiveInteger1.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            positiveInteger1.setValue(-1); // Bu artıq yoxlama ilə işləyir
            System.out.println(positiveInteger1.getValue() + " - " + positiveInteger1.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            positiveInteger1.setValue(positiveInteger1.getValue() + 1);
            System.out.println(positiveInteger1.getValue() + " - " + positiveInteger1.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            PositiveInteger positiveInteger2 = new PositiveInteger("-3");
            System.out.println(positiveInteger2.getValue() + " - " + positiveInteger2.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            PositiveInteger positiveInteger3 = new PositiveInteger(379);
            System.out.println(positiveInteger3.getValue() + " - " + positiveInteger3.isPrime());
        } catch (Exception ex) {
            System.out.println(ex.get


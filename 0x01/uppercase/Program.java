package uppercase;

public class Program {
    public static void main(String[] args) {

        boolean characterInUppercase1 = Character.isUpperCase('a');
        boolean characterInUppercase2 = Character.isUpperCase('B');
        boolean characterInUppercase3 = Character.isUpperCase('d');
        boolean characterInUppercase4 = Character.isUpperCase('f');
        boolean characterInUppercase5 = Character.isUpperCase('G');

        System.out.printf("%b\n", characterInUppercase1);
        System.out.printf("%b\n", characterInUppercase2);
        System.out.printf("%b\n", characterInUppercase3);
        System.out.printf("%b\n", characterInUppercase4);
        System.out.printf("%b\n", characterInUppercase5);
    }
}
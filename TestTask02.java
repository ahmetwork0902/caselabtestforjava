import java.util.Random;

public class TestTask02 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println("Значения переменных до замены местами: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Значения переменных после замены местами: a = " + a + ", b = " + b);
    }
}

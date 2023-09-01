import java.util.Scanner;

public class TestTask03p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " - эта строка является палиндром!");
        } else {
            System.out.println(str + " - эта строка не является палиндром!");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}

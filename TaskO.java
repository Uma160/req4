import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int n) {
        // Отрицательные числа не могут быть палиндромами из-за знака минус
        if (n < 0) {
            return false;
        }

        int originalNumber = n;
        int reversed = 0;

        // Разворачиваем число
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        // Если развернутое число равно исходному — это палиндром
        return originalNumber == reversed;
    }
}

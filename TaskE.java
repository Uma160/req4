import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        // Числа меньше или равные 1 не являются простыми
        if (n <= 1) {
            return false;
        }

        // Проверяем делители от 2 до квадратного корня из n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Найдено деление без остатка, число составное
            }
        }

        return true; // Делителей не найдено, число простое
    }
}

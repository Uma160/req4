import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Factorial = " + factorial(n));

        scanner.close();
    }

    public static long factorial(int n) {
        // Факториал 0 и 1 равен 1
        if (n <= 1) {
            return 1;
        }

        long result = 1;
        // Перемножаем числа от 2 до N
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result; // Используем long, так как факториал растет очень быстро
    }
}

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите границы диапазона A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        // Проходим по всему диапазону [A, B]
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Prime Count = " + count);

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

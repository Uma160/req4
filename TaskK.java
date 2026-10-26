import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("LCM = " + lcm(a, b));

        scanner.close();
    }

    // Функция для поиска LCM (на основе формулы: (a * b) / gcd(a, b))
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        // Сначала делим, чтобы избежать переполнения при умножении (a * b)
        return (a / gcd(a, b)) * b;
    }

    // Вспомогательная функция для поиска GCD (Алгоритм Евклида)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

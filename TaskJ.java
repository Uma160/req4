import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD = " + gcd(a, b));

        scanner.close();
    }

    public static int gcd(int a, int b) {
        // Использование цикла по алгоритму Евклида
        while (b != 0) {
            int temp = b;
            b = a % b; // Получаем остаток от деления
            a = temp;
        }
        return a;
    }
}

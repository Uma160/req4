import java.util.Scanner;

public class TaskМ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер N (нечетное число для симметрии): ");
        int n = scanner.nextInt();

        printXPattern(n);

        scanner.close();
    }

    public static void printXPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Печатаем звездочку на главной диагонали (i == j)
                // или на побочной диагонали (i + j == n + 1)
                if (i == j || (i + j == n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Переход на новую строку после каждого ряда
        }
    }
}

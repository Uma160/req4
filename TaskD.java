import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк N и столбцов M: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        printMatrix(n, m);

        scanner.close();
    }

    public static void printMatrix(int n, int m) {
        int currentNumber = 1; // Счетчик для последовательных чисел

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++; // Переходим к следующему числу
            }
            System.out.println(); // Переход на новую строку после каждого ряда
        }
    }
}

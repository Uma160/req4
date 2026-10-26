import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Reversed = " + reverseNumber(n));

        scanner.close();
    }

    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;          // Извлекаем последнюю цифру
            reversed = reversed * 10 + digit; // Сдвигаем разряд и добавляем цифру
            n = n / 10;                  // Удаляем последнюю цифру из числа
        }

        return reversed;
    }
}

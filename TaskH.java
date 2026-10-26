import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число N: ");
        int n = scanner.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));

        scanner.close();
    }

    public static String decimalToBinary(int n) {
        // Если число равно 0, его двоичное представление — "0"
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        // Цикл деления на 2 до тех пор, пока n больше 0
        while (n > 0) {
            int remainder = n % 2;       // Получаем остаток (0 или 1)
            binary.insert(0, remainder); // Добавляем остаток в начало строки
            n = n / 2;                   // Делим число нацело на 2
        }

        return binary.toString();
    }
}

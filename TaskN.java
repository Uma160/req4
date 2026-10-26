import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число N: ");
        long n = scanner.nextLong(); // Используем long для поддержки больших чисел

        System.out.println("Результат: " + transformDigits(n));

        scanner.close();
    }

    public static long transformDigits(long n) {
        if (n == 0) {
            return 1; // 0 — четное число, увеличиваем на 1
        }

        long result = 0;
        long placeValue = 1; // Множитель для сохранения правильного разряда числа

        while (n > 0) {
            long digit = n % 10; // Получаем последнюю цифру
            long transformedDigit;

            if (digit % 2 == 0) {
                transformedDigit = digit + 1; // Четную увеличиваем на 1
            } else {
                transformedDigit = digit - 1; // Нечетную уменьшаем на 1
            }

            // Собираем число обратно, сохраняя порядок разрядов
            result += transformedDigit * placeValue;
            placeValue *= 10;
            n = n / 10;
        }

        return result;
    }
}

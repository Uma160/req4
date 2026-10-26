public class TaskI {
    public static void main(String[] args) {
        // Проходим циклом по всем трехзначным числам
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Переход на новую строку в конце
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        // Так как диапазон от 100 до 999, все числа строго трехзначные.
        // Для каждого числа возводим цифры в куб (степень 3).
        while (n > 0) {
            int digit = n % 10;          // Получаем последнюю цифру
            sum += digit * digit * digit; // Возводим в куб и прибавляем к сумме
            n = n / 10;                  // Удаляем последнюю цифру
        }

        // Если сумма кубов цифр равна исходному числу, оно является числом Армстронга
        return sum == originalNumber;
    }
}

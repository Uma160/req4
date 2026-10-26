import java.util.Scanner;
public class TaskB {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int u = n.nextInt();
        printHollowSquare(u);
    }

    public static void printHollowSquare(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

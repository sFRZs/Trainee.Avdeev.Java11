import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            int num = sc.nextInt();

            if (num > 7) {
                System.out.println("Привет.");
            }
        }

    }
}
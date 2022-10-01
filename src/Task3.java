import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите количество элементов массива: ");
            int n = Integer.parseInt(sc.nextLine());

            int[] arr = new int[n];

            System.out.print("Желаете ввести элементы массива вручную? (y/n)): ");
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                System.out.println("Введите элементы массива:");

                for (int i = 0; i < n; i++) {
                    System.out.print(">>");
                    arr[i] = sc.nextInt();
                }
            } else if (answer.equals("n")) {
                for (int i = 0; i < n; i++) {
                    arr[i] = (int) (Math.random() * (200 + 1)) - 100;
                }
            }
            System.out.println();
            System.out.print("Исходный массив: ");
            for (int el : arr) {
                System.out.print(el + " ");
            }

            System.out.println("");
            System.out.print("Элементы массива, кратные 3: ");
            for (int el : arr) {
                if (el % 3 == 0) {
                    System.out.print(el + " ");
                }
            }
        }
    }
}
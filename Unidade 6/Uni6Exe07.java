import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe a quantidade de posições desejada, com limite máximo de 20: ");
        int n = scanner.nextInt();
        if (n > 20) {
            System.out.println("Quantidade inválida!");
        } else {
            int[] numbers = new int[n];

            insertArray(scanner, numbers);
            int[] orderedArray = sortArray(numbers);
            printFinalArray(orderedArray);
        }

        scanner.close();
    }

    public static void insertArray(Scanner scanner, int numbers[]) {
        System.out.println("Vamos popular o array!");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = scanner.nextInt();

            boolean existsArray = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == num) {
                    existsArray = true;
                    System.out.println("Número já está no array. Por favor, informe outro número.");
                    i--;
                }
            }
            if (!existsArray) {
                numbers[i] = num;
            }
        }
    }

    public static int[] sortArray(int numbers[]) {
        Arrays.sort(numbers);
        return numbers;

    }

    public static void printFinalArray(int orderedArray[]) {
        System.out.println("Array organizado:");

        for (int i = 0; i < 5; i++) {
            System.out.println(" " + orderedArray[i]);
        }
    }
}

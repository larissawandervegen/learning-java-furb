import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        readNum(numbers);
        printNum(numbers);
    }

    public static void readNum(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void printNum(int[] numbers) {
        System.out.println("Números na ordem inversa:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
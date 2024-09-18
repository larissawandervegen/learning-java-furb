import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int num = scanner.nextInt();

        double biggestNum = 0;
        double smallestNum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double n = scanner.nextDouble();

            if (n > biggestNum) {
                biggestNum = n;
            }
            if (n < smallestNum) {
                smallestNum = n;
            }
        }
        System.out.println("Maior número: " + biggestNum);
        System.out.println("Menor número: " + smallestNum);

        scanner.close();
    }
}

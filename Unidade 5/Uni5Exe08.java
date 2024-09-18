import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int num = scanner.nextInt();

        double positive = 0;
        double negative = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double n = scanner.nextDouble();

            if (n % 2 == 0 && n > 0) {
                positive += n;
            }
            if (n < negative) {
                negative = n;
            }
        }
        System.out.println("A soma dos números positivos é igual à: " + positive);
        System.out.println("O menor número negativo é igual à: " + negative);

        scanner.close();

    }
}
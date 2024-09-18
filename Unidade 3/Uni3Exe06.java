import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o peso do prato em gramas:");

        double pesoPrato = scanner.nextDouble();
        double valorKg = 25;

        double valorPagar = pesoPrato * (valorKg / 1000);

        System.out.printf("O valor a pagar para um prato de " + pesoPrato + "g é igual a R$ %.2f", valorPagar);

        scanner.close();
    }
}

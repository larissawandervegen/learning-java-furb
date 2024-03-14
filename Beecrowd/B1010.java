import java.util.Scanner;

public class B1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cod1 = scanner.nextInt();
        int qtd1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();

        int cod2 = scanner.nextInt();
        int qtd2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();

        double total = ((qtd1 * valorUnitario1)+ (qtd2 * valorUnitario2));

        System.out.printf("VALOR A PAGAR: R$ %2.f" + total);

        scanner.close();

    }
}

// Início
// Ler(cod1);

// Ler(qtd1);

// Ler(valorUnitario1);

// Ler(cod2);

// Ler(qtd2);

// Ler(valorUnitario2);
// total = ((qtd1 * valorUnitario1)+ (qtd2 * valorUnitario2))
// Fim;
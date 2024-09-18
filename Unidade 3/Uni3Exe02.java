import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do par de sapatos:");
        double preco = scanner.nextDouble();

        double discontoF = 0.12;
        double desconto = preco * discontoF;
        double total = preco - desconto;

        System.out.printf("O valor do desconto é de R$ %.2f\n", desconto);
        System.out.printf("O preço do par de sapatos com desconto é R$ %.2f", total);

        scanner.close();
    }
}

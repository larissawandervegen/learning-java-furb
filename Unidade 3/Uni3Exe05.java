import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de galinhas na granja:");
        int galinhas = scanner.nextInt();
        
        double anelChip = galinhas * 4;
        double anelAlimentacao = galinhas * (3.50 * 2);

        System.out.printf("O gasto total da granja para marcar todos os seus frangos é de R$%.2f", anelChip + anelAlimentacao);

        scanner.close();
    }
}

import java.util.Scanner;

public class SimuladoP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao Hotel WanderSpa!");
        System.out.println("Temos diversas opções de quartos:");
        System.out.println("Opção 1 - Quarto Single para 1 pessoa por R$120,00.");
        System.out.println("Opção 2 - Quarto Double para 2 pessoas por R$180,00.");
        System.out.println("Opção 3 - Quarto Triple para 3 pessoas por R$250,00.");
        System.out.println("Opção 4 - Suíte Master para 4 pessoas por R$320,00.");

        System.out.println("Informe a opção desejada:");
        int opcaoQuarto = scanner.nextInt();
        System.out.println("Informe a quantidade de dias de hospedagem:");
        int qtdDiarias = scanner.nextInt();
        int valor = 0;
        double taxaTurismo = 0.12;

        switch (opcaoQuarto) {
            case 1:
                valor = 120;
                break;
            case 2:
                valor = 180;
                break;
            case 3:
                valor = 250;
                break;
            case 4:
                valor = 320;
                break;
            default:
                System.out.println("Quantidade inválida!");
        }
        double total = ((valor * qtdDiarias) * taxaTurismo) + valor * qtdDiarias;
        System.out.printf("O total é igual a R$ %.2f", total);
        
        scanner.close();
    }
}

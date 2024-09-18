import java.util.Scanner;

public class UniExe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em dólar a ser trocado:");
        double dolar = scanner.nextDouble();
        
        double reais = 5.06 * dolar;

        System.out.printf("O valor em reais é igual a R$%.2f", reais);

        scanner.close();
    }
}

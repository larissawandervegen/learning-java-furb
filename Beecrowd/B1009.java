import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        int totalVendas = scanner.nextInt();
        
        double salario = (salarioFixo + (totalVendas * 0.15));

        System.out.printf("TOTAL = %.2f" + salario);

        scanner.close();
    }
}

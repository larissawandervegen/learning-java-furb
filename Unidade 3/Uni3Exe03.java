import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o valor da gasolina:");
        double gasolina = scanner.nextDouble();

        System.out.println("Insira o valor do pagamento:");
        double pagamento = scanner.nextDouble();

        double litros = pagamento / gasolina;
        
        System.out.printf("A quantidade de litros abastecido foi %.2f", litros);

        scanner.close();
    }
    
}
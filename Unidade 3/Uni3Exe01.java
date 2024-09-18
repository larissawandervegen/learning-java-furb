import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da largura do terreno:");
        double base = scanner.nextDouble();

        System.out.println("Informe o tamanho do comprimento do terreno:");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A área do terreno é " + area);
        
        scanner.close();
    }
    
}
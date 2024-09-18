import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota:");
        double nota3 = scanner.nextDouble();

        double mediaPonderada = (((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10);
        
        System.out.printf("A média ponderada é %.2f", mediaPonderada);

        scanner.close();
    }
}

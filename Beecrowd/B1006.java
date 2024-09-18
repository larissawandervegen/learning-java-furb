import java.util.Scanner;

public class B1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double mediaPonderada = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);

        System.out.println("MEDIA = %.5f%n" + mediaPonderada);

        scanner.close();
    }
}

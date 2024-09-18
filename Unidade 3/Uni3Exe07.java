import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quatidade de latas de 350ml compradas?");
        int l350 = scanner.nextInt();

        System.out.println("Qual a quatidade de garrafas de 600ml compradas?");
        int g600 = scanner.nextInt();

        System.out.println("Qual a quatidade de garrafas de 2L compradas?");
        int g2000 = scanner.nextInt();

        double litros = (l350 * 0.35) + (g600 * 0.6) + (g2000 * 2);

        System.out.println("A quantidade de litros comprada é igual a " + litros);

        scanner.close();
    }
}

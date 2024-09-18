import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l350 = scanner.nextInt();
        int g600 = scanner.nextInt();
        int g2000 = scanner.nextInt();

        double litros = (l350 * 0.35) + (g600 * 0.6) + (g2000 * 2);

        System.out.println(litros);

        scanner.close();
    }
}
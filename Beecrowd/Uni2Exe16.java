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

// int L350, G600, G2000;
// double LITROS;
// Ler (L350);
// Ler (G600);
// Ler (G2000);
// LITROS = (L3500.35) + (G6000.6) + (G2000*2);
// Escrever (LITROS);
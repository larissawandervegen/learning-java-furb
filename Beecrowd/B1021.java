import java.util.Scanner;

public class B1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int aux = (int) (valor * 100);
        int c100 = aux / 10000;
        aux = aux % 10000;
        int c50 = aux / 5000;
        aux = aux % 5000;
        int c20 = aux / 2000;
        aux = aux % 2000;
        int c10 = aux / 1000;
        aux = aux % 1000;
        int c5 = aux / 500;
        aux = aux % 500;
        int c2 = aux / 200;
        aux = aux % 200;
        int m100 = aux / 100;
        aux = aux % 100;
        int m50 = aux / 50;
        aux = aux % 50;
        int m25 = aux / 25;
        aux = aux % 25;
        int m10 = aux / 10;
        aux = aux % 10;
        int m5 = aux / 5;
        aux = aux % 5;
        int m1 = aux;

        System.out.println("NOTAS:");
        System.out.println(c100 + " nota(s) de R$ 100.00");
        System.out.println(c50 + " nota(s) de R$ 50.00");
        System.out.println(c20 + " nota(s) de R$ 20.00");
        System.out.println(c10 + " nota(s) de R$ 10.00");
        System.out.println(c5 + " nota(s) de R$ 5.00");
        System.out.println(c2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m100 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m1 + " moeda(s) de R$ 0.01");

        scanner.close();

    }
}

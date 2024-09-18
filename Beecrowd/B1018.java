import java.util.Scanner;

public class B1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int aux = valor;
        int c100 = valor / 100;
        aux = aux - (c100 * 100);
        int c50 = aux / 50;
        aux = aux - (c50 * 50);
        int c20 = aux / 20;
        aux = aux - (c20 * 20);
        int c10 = aux / 10;
        aux = aux - (c10 * 10);
        int c5 = aux / 5;
        aux = aux - (c5 * 5);
        int c2 = aux / 2;
        aux = aux - (c2 * 2);
        int c1 = aux; 

        System.out.println(valor);
        System.out.println(c100 + " nota(s) de R$ 100,00");
        System.out.println(c50 + " nota(s) de R$ 50,00");
        System.out.println(c20 + " nota(s) de R$ 20,00");
        System.out.println(c10 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c2 + " nota(s) de R$ 2,00");
        System.out.println(c1 + " nota(s) de R$ 1,00");

        scanner.close();
    }
}
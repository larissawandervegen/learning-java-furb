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

// Ler(VALOR);
// AUX = VALOR;
// C100 = VALOR / 100;
// AUX = AUX - (C100 * 100);
// C50 = AUX / 50;
// AUX = AUX - (C50 * 50);
// C20 = AUX / 20;
// AUX = AUX - (C20 * 20);
// C10 = AUX / 10;
// AUX = AUX - (C10 * 10)
// C5 = AUX / 5;
// AUX = AUX - (C5 * 5);
// C2 = AUX / 2;
// AUX = AUX - (C2 * 2);
// C1 = AUX; // não precisa da fórmula pq só chega a 1
// Escrever(VALOR);
// Escrever("100: " + C100)
// Escrever("50: " + C50);
// Escrever("20: " + C20);
// Escrever("10: " + C10);
// Escrever("5: " + C5);
// Escrever("2: " + C2);
// Escrever("1: " + C1);
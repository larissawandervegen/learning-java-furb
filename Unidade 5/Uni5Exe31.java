import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            System.out.println("Número\tDecomposição");
            decomporEmFatoresPrimos(num);
        }

        scanner.close();
    }

    public static void decomporEmFatoresPrimos(int num) {
        int n = num;
        int factor = 2;

        while (n > 1) {
            while (n % factor == 0) {
                System.out.println(n + "\t" + factor);
                n /= factor;
            }
            factor++;
        }

        System.out.println(n);
    }
}

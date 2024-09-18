import java.util.Scanner;

public class B1805 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            long somaAteB = somaAteN(B);
            long somaAteAmenos1 = somaAteN(A - 1);

            long resultado = somaAteB - somaAteAmenos1;

            System.out.println(resultado);
        }

        scanner.close();
    }

    public static long somaAteN(long N) {
        return N * (N + 1) / 2;
    }
}

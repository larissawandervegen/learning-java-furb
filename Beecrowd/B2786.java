import java.util.Scanner;

public class B2786 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int tipo1 = (L * C + (L - 1) * (C - 1));

        int tipo2 = 2 * (L - 1 + C - 1);

        System.out.println(tipo1);
        System.out.println(tipo2);
    }
}

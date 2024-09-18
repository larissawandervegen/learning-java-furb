import java.util.Scanner;

public class B1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        int numeroImpar;

        if (X % 2 == 0) {
            numeroImpar = X + 1;
        } else {
            numeroImpar = X;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(numeroImpar);
            numeroImpar += 2;
        }
    }
}

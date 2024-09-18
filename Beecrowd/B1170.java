import java.util.Scanner;

public class B1170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            double C = scanner.nextDouble();
            int dias = 0;

            while (C > 1) {
                C /= 2;
                dias++;
            }

            System.out.println(dias + " dias");
        }

        scanner.close();
    }
}

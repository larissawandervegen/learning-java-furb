import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int[] idades = new int[N];

            for (int i = 0; i < N; i++) {
                idades[i] = scanner.nextInt();
            }

            int idadeCapitao = idades[N / 2];

            System.out.printf("Case %d: %d%n", t, idadeCapitao);
        }

        scanner.close();
    }
}

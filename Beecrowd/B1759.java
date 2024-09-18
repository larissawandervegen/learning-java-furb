import java.util.Scanner;

public class B1759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i > 0) {
                resultado.append(" ");
            }
            resultado.append("Ho");
        }
        resultado.append("!");

        System.out.println(resultado.toString());
    }
}
import java.util.Scanner;

public class B1555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int resultadoRafael = calcularRafael(x, y);
            int resultadoBeto = calcularBeto(x, y);
            int resultadoCarlos = calcularCarlos(x, y);

            if (resultadoRafael > resultadoBeto && resultadoRafael > resultadoCarlos) {
                System.out.println("Rafael ganhou");
            } else if (resultadoBeto > resultadoRafael && resultadoBeto > resultadoCarlos) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }

        scanner.close();
    }

    private static int calcularRafael(int x, int y) {
        return (int) (Math.pow(3 * x, 2) + Math.pow(y, 2));
    }

    private static int calcularBeto(int x, int y) {
        return 2 * (int) (Math.pow(x, 2)) + (int) (Math.pow(5 * y, 2));
    }

    private static int calcularCarlos(int x, int y) {
        return -100 * x + (int) (Math.pow(y, 3));
    }
}

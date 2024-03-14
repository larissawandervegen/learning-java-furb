import java.util.Scanner;

public class B1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int aux = tempo;
        h = tempo / 3600;
        aux = aux - (h * 3600);
        m = aux / 60;
        aux = aux - (m * 60);
        s = aux;

        System.out.println(h + ":" + m + ":" + s);

        scanner.close();

    }
}

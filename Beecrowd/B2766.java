import java.util.Scanner;

public class B2766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.next();
        }

        System.out.println(nomes[2]);

        System.out.println(nomes[6]);

        System.out.println(nomes[8]);

        scanner.close();
    }
}

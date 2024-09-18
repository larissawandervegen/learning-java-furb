import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dobras = scanner.nextInt();
        double qtdDobras = dobras * dobras;

        System.out.println(qtdDobras);

        scanner.close();
    }
}

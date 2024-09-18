import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double a = (b * c) / d;

        System.out.println(a);

        scanner.close();
    }
}
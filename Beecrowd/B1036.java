import java.util.Scanner;

public class B1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = ((b * b) + (-4 * (a * c)));

        if (delta > 0 && a != 0) {
            double R1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double R2 = ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.printf("R1 = %.5f", R1);
            System.out.printf("R2 = %.5f", R2);
        } else {
            System.out.println("Impossivel calcular");
        }

        scanner.close();
    }
}

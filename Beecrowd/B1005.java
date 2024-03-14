import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class B1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double mediaPonderada = (((nota1 * 3.5) + (nota2 * 7.5)) / 11);
        BigDecimal media = new BigDecimal(mediaPonderada).setScale(5, RoundingMode.HALF_EVEN);

        System.out.println("MEDIA = " + media);

        scanner.close();
    }
}

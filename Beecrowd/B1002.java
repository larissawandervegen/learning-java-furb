import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class B1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextInt();
        raio = Math.pow(raio, 2);
        BigDecimal r = new BigDecimal(raio).setScale(4, RoundingMode.HALF_EVEN);
        BigDecimal pi = new BigDecimal("3.14159");
        BigDecimal area = pi.multiply(r);

        System.out.println("Area: " + area);

        scanner.close();
    }
}

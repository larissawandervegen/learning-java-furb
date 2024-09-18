import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class B1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
        } else {
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        }else{
            System.out.printf(Locale.US, "R$ %.2f", imposto);
        }
        scanner.close();
    
    
    }
}

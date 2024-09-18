import java.util.Scanner;

public class UniExe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a medida do primeiro cateto?");
        double cateto1 = scanner.nextDouble();

        System.out.println("Qual a medida do segundo cateto?");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        System.out.println("O valor da hipotenusa é igual a " + Math.sqrt(hipotenusa));

        scanner.close();
    }
}

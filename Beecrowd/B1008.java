import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFuncionario = scanner.nextInt();
        double horasTrabalhadas = scanner.nextDouble();
        double valorHora = scanner.nextDouble();

        double salario = (horasTrabalhadas * valorHora);

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}

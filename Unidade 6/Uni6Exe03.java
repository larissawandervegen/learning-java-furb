import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] values = new double[12];
        readValues(values);
        ajustValues(values);
        printValues(values);
    }

    public static void readValues(double[] values) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 12 valores reais:");
        for (int i = 0; i < values.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void ajustValues(double[] values) {
        for (int i = 0; i < values.length; i++) {
            if ((i + 1) % 2 == 0)
                values[i] *= 1.0;
            else
                values[i] *= 1.05;
        }
    }

    public static void printValues(double[] values) {
        System.out.println("Valores ajustados:");
        for (int i = 0; i < values.length; i++)
            System.out.println("Posição " + (i + 1) + ": " + values[i]);
    }
}

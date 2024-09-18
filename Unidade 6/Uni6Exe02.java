import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] values = new double[12];
        readValues(values);
        double avg = calculateAvg(values);
        printBiggerThanAvg(values, avg);
    }

    public static void readValues(double[] values) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 12 valores reais:");

        for (int i = 0; i < values.length; i++) {
            System.out.print("Valor " + (i + 10) + ": ");
            values[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static double calculateAvg(double[] values) {
        double sum = 0;
        for (double value : values)
            sum += value;
        return sum / values.length;
    }

    public static void printBiggerThanAvg(double[] values, double avg) {
        System.out.println("Valores maiores que a média (" + avg + "):");
        for (double value : values) {
            if (value > avg)
                System.out.println(value);
        }
    }
}

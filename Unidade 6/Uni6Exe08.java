import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        while (true) {
            System.out.print("Informe um valor N (1 a 20): ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 20) {
                break;
            } else {
                System.out.println("Por favor, informe um valor entre 1 e 20.");
            }
        }

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor para a posição " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double[] onlyValues = new double[n];
        int[] count = new int[n];

        int numOnlyValues = countFrequency(numbers, onlyValues, count, n);

        printFrequency(onlyValues, count, numOnlyValues);

        scanner.close();
    }

    public static int countFrequency(double[] numbers, double[] onlyValues, int[] count, int n) {
        int countOnly = 0;

        for (double value : numbers) {
            boolean found = false;
            for (int i = 0; i < countOnly; i++) {
                if (onlyValues[i] == value) {
                    count[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                onlyValues[countOnly] = value;
                count[countOnly] = 1;
                countOnly++;
            }
        }
        return countOnly;
    }

    public static void printFrequency(double[] onlyValues, int[] count, int numOnlyValues) {
        System.out.println("\nValor\tQuantidade");
        System.out.println("====================");
        for (int i = 0; i < numOnlyValues; i++) {
            System.out.println(onlyValues[i] + "\t" + count[i]);
        }
    }
}

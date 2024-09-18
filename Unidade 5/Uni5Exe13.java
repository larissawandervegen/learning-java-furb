import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número total de reabastecimentos feitos:");
        int numGasTimes = scanner.nextInt();

        double totalKilometers = 0;
        double totalLiters = 0;
        double previousKilo = 0;

        for (int i = 0; i < numGasTimes; i++) {
            System.out.println("\nReabastecimento #" + (i + 1));
            System.out.println("Digite a quilometragem registrada no odômetro:");
            double kilometers = scanner.nextDouble();

            if (i != 0) {
                double kiloPerLiters = (kilometers - previousKilo) / totalLiters;
                System.out.println("Quilometragem por litro na parada nº" + i + ": " + kiloPerLiters + " km/L");
            }

            System.out.println("Digite a quantidade de litros de combustível comprados:");
            double liters = scanner.nextDouble();

            totalKilometers = kilometers;
            totalLiters += liters;
            previousKilo = kilometers;
        }

        double avgKilo = totalKilometers / totalLiters;

        System.out.println("\nQuilometragem média obtida por litro de combustível em toda a viagem: " + avgKilo + " km/L");

        scanner.close();
    }
}

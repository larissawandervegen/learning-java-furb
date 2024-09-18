import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio que Astolfo se nega a pagar: R$ ");
        double maxValueStop = scanner.nextDouble();

        int ridesAbove = 0;
        int totalRides = 0;
        int ridesAbove150km = 0;

        while (true) {
            System.out.print("Pedágio do trecho (ou -1 para encerrar): R$ ");
            double priceStop = scanner.nextDouble();

            if (priceStop < 0) {
                break;
            }

            totalRides++;

            System.out.print("Distância do trecho (em Km): ");
            int distance = scanner.nextInt();

            if (priceStop > maxValueStop) {
                ridesAbove++;
            }

            if (distance > 150 && priceStop <= maxValueStop) {
                ridesAbove150km++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println(ridesAbove + " (trechos com valor acima do qual Astolfo se nega a pagar)");
        System.out.println(totalRides + " (quantidade de trechos informados)");
        System.out.println(ridesAbove150km + " (trechos acima de 150km com valor aceito por Astolfo)");

        scanner.close();
    }
}

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a massa inicial do material em Kg: ");
        double initialMass = scanner.nextDouble();

        double currentMass = initialMass;
        int totalTime = 0;
        int timePCicle = 50;

        while (currentMass >= 0.5) {
            currentMass /= 2;
            totalTime += timePCicle;
        }

        System.out.println("Massa inicial é igual à: " + initialMass + " Kg");
        System.out.println("Massa final é igual à: " + currentMass + " Kg");
        System.out.println("Tempo necessário é igual à: " + totalTime + " segundos");

        scanner.close();
    }
}

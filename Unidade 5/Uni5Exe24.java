import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite diário de peso de pesca (em quilogramas): ");
        double diaryLimit = scanner.nextDouble();
        diaryLimit *= 1000;

        double totalWeight = 0;

        char proceed;
        do {
            System.out.print("Informe o peso do peixe (em gramas): ");
            double fishWeight = scanner.nextDouble();

            totalWeight += fishWeight;

            if (totalWeight > diaryLimit) {
                System.out.println("O limite diário de peso de pesca excedido!");
                System.out.println("Peso total da pesca é igual à: " + totalWeight + " gramas.");
                return;
            }

            System.out.print("Deseja informar o peso de mais um peixe? Responda s (SIM) ou n (NÂO): ");
            proceed = scanner.next().charAt(0);
        } while (proceed == 's' || proceed == 'S');

        System.out.println("Peso total da pesca é igual à : " + totalWeight + " gramas.");

        scanner.close();
    }
}

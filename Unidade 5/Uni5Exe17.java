import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de inscrição e a altura de cada atleta (ou 0 para encerrar):");

        int numSub;
        double hight, totalHight = 0;
        double maxHight = Double.MIN_VALUE;
        double lowHight = Double.MAX_VALUE;
        int countAthletes = 0;

        while (true) {
            System.out.print("Número de inscrição: ");
            numSub = scanner.nextInt();
            
            if (numSub == 0) {
                break;
            }

            System.out.print("Altura (em metros): ");
            hight = scanner.nextDouble();
            
            totalHight += hight;
            countAthletes++;

            maxHight = Math.max(maxHight, hight);
            lowHight = Math.min(lowHight, hight);
        }

        double avgHight = countAthletes > 0 ? totalHight / countAthletes : 0;

        System.out.println("Atleta mais alto com o número de inscrição: " + numSub + ", Altura: " + maxHight);
        System.out.println("Atleta mais baixo com o número de inscrição: " + numSub + ", Altura: " + lowHight);
        System.out.println("A altura média do grupo de atletas é igual à: " + avgHight);

        scanner.close();
    }
}

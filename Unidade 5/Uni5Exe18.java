import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do canal e o número de pessoas assistindo (ou 0 para encerrar):");

        int channel, totalPpl = 0;
        int totalChannel4 = 0, totalChannel5 = 0, totalChannel9 = 0, totalChannel12 = 0;

        while (true) {
            System.out.print("Informe o número do canal (4, 5, 9 ou 12): ");
            channel = scanner.nextInt();
            
            if (channel == 0) {
                break;
            }

            System.out.print("Número de pessoas assistindo é igual à: ");
            int pplWatching = scanner.nextInt();
            
            totalPpl += pplWatching;

            switch (channel) {
                case 4:
                    totalChannel4 += pplWatching;
                    break;
                case 5:
                    totalChannel5 += pplWatching;
                    break;
                case 9:
                    totalChannel9 += pplWatching;
                    break;
                case 12:
                    totalChannel12 += pplWatching;
                    break;
                default:
                    System.out.println("Canal inválido!");
            }
        }

        double percentageC4 = (double) totalChannel4 / totalPpl * 100;
        double percentageC5 = (double) totalChannel5 / totalPpl * 100;
        double percentageC9 = (double) totalChannel9 / totalPpl * 100;
        double percentageC12 = (double) totalChannel12 / totalPpl * 100;

        System.out.println("Canal 4: " + percentageC4 + "%");
        System.out.println("Canal 5: " + percentageC5 + "%");
        System.out.println("Canal 9: " + percentageC9 + "%");
        System.out.println("Canal 12: " + percentageC12 + "%");

        scanner.close();
    }
}

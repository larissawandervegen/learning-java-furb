import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votesNenhumDeNos = 0;
        int votesCPM22 = 0;
        int votesSkank = 0;
        int votesJotaQuest = 0;
        int totalVotes = 0;

        char proceed = 's';

        do {
            System.out.println("Vote no seu conjunto favorito:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            System.out.print("Digite o código do conjunto: ");
            int code = scanner.nextInt();

            switch (code) {
                case 1:
                    votesNenhumDeNos++;
                    break;
                case 2:
                    votesCPM22++;
                    break;
                case 3:
                    votesSkank++;
                    break;
                case 4:
                    votesJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    continue;
            }

            totalVotes++;

            System.out.print("Mais um voto? (s/n): ");
            proceed = scanner.next().charAt(0);
        } while (proceed == 's' || proceed == 'S');

        double pNenhumDeNos = (votesNenhumDeNos * 100.0) / totalVotes;
        double pCPM22 = (votesCPM22 * 100.0) / totalVotes;
        double pSkank = (votesSkank * 100.0) / totalVotes;
        double pJotaQuest = (votesJotaQuest * 100.0) / totalVotes;

        int winner = 1;
        int maxVotes = votesNenhumDeNos;

        if (votesCPM22 > maxVotes) {
            winner = 2;
            maxVotes = votesCPM22;
        }
        if (votesSkank > maxVotes) {
            winner = 3;
            maxVotes = votesSkank;
        }
        if (votesJotaQuest > maxVotes) {
            winner = 4;
            maxVotes = votesJotaQuest;
        }

        System.out.println("\nResultados da eleição:");
        System.out.println("Nenhum de Nós: " + votesNenhumDeNos + " votos (" + pNenhumDeNos + "%)");
        System.out.println("CPM22: " + votesCPM22 + " votos (" + pCPM22 + "%)");
        System.out.println("Skank: " + votesSkank + " votos (" + pSkank + "%)");
        System.out.println("Jota Quest: " + votesJotaQuest + " votos (" + pJotaQuest + "%)");
        System.out.print("O conjunto vencedor é: ");

        switch (winner) {
            case 1:
                System.out.println("Nenhum de Nós");
                break;
            case 2:
                System.out.println("CPM22");
                break;
            case 3:
                System.out.println("Skank");
                break;
            case 4:
                System.out.println("Jota Quest");
                break;
        }

        scanner.close();
    }
}

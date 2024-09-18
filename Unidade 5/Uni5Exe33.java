import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vote, totalVotes = 0, votesCandidate1 = 0, votesCandidate2 = 0, votesCandidate3 = 0, votesCandidate4 = 0;
        int nullVotes = 0, blankVotes = 0;

        System.out.println("Votação para presidente:");
        System.out.println("Digite o número correspondente ao seu voto (ou 0 para encerrar):");

        do {
            vote = scanner.nextInt();

            switch (vote) {
                case 0:
                    break;
                case 1:
                    votesCandidate1++;
                    break;
                case 2:
                    votesCandidate2++;
                    break;
                case 3:
                    votesCandidate3++;
                    break;
                case 4:
                    votesCandidate4++;
                    break;
                case 5:
                    nullVotes++;
                    break;
                case 6:
                    blankVotes++;
                    break;
                default:
                    System.out.println("Opção incorreta! Por favor, digite um número de 0 a 6.");
            }

            totalVotes++;

        } while (vote != 0);

        double pNull = (double) nullVotes / totalVotes * 100;
        double pBlank = (double) blankVotes / totalVotes * 100;

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + votesCandidate1);
        System.out.println("Candidato 2: " + votesCandidate2);
        System.out.println("Candidato 3: " + votesCandidate3);
        System.out.println("Candidato 4: " + votesCandidate4);
        System.out.println("Total de votos nulos: " + nullVotes);
        System.out.println("Total de votos em branco: " + blankVotes);
        System.out.println("Percentual de votos nulos sobre o total: " + pNull + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + pBlank + "%");

        scanner.close();
    }
}

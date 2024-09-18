import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

    private static final int tamanho = 8;
    private static final int numNavios = 10;
    private static final int numMaxTentativas = 30;
    private static char[][] tabuleiro = new char[tamanho][tamanho];
    private static boolean[][] navios = new boolean[tamanho][tamanho];
    private static int naviosRestantes = numNavios;
    private static int tentativas = 0;

    public static void main(String[] args) {
        System.out.println("Vamos jogar Batalha Naval!");

        IniciarTabuleiro();
        AdicionarNavios();

        Scanner scanner = new Scanner(System.in);

        while (tentativas < numMaxTentativas && naviosRestantes > 0) {
            MostrarTabuleiro(false);
            System.out.println("Tentativa " + (tentativas + 1) + " de " + numMaxTentativas);

            System.out.print("Insira a linha (0-7): ");
            int linha = scanner.nextInt();

            if (linha < 0 || linha > 7) {
                System.out.println("Linha inválida! São aceitas posições de 0 a 7.");
                continue;
            }

            System.out.print("Insira a coluna (0-7): ");
            int coluna = scanner.nextInt();

            if (coluna < 0 || coluna > 7) {
                System.out.println("Coluna inválida! São aceitas posições de 0 a 7.");
                continue;
            }

            tentativas++;

            if (navios[linha][coluna]) {
                System.out.println("Acertou um navio!");
                tabuleiro[linha][coluna] = 'X';
                naviosRestantes--;
            } else if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Posição já inserida anteriormente!");
                tentativas--;
            } else {
                System.out.println("Errou.");
                tabuleiro[linha][coluna] = 'O';
            }

        }

        if (naviosRestantes == 0) {
            System.out.println("Parabéns! Todos os navios foram destruídos!");
        } else {
            System.out.println("Fim de jogo! Você não conseguiu destruir todos os navios.");
        }

        MostrarTabuleiro(true);
        scanner.close();
    }

    private static void IniciarTabuleiro() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = '~';
                navios[i][j] = false;
            }
        }
    }

    private static void AdicionarNavios() {
        Random random = new Random();
        int naviosColocados = 0;

        while (naviosColocados < numNavios) {
            int linha = random.nextInt(tamanho);
            int coluna = random.nextInt(tamanho);

            if (!navios[linha][coluna]) {
                navios[linha][coluna] = true;
                naviosColocados++;
            }

        }

    }

    private static void MostrarTabuleiro(boolean mostrarNavios) {
        System.out.println();
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tamanho; j++) {
                if (mostrarNavios && navios[i][j]) {
                    System.out.print("N ");
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
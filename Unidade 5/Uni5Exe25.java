import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerDPoints = 0;
        int playerLeftPoints = 0;

        while (true) {
            System.out.print("Digite o código do ponto (D para jogador da direita, E para jogador da esquerda): ");
            char point = scanner.next().charAt(0);

            if (point == 'D') {
                playerDPoints++;
            } else if (point == 'E') {
                playerLeftPoints++;
            } else {
                System.out.println("Código inválido. Digite D para jogador da direita ou E para jogador da esquerda.");
                continue;
            }

            if (playerDPoints >= 21 || playerLeftPoints >= 21) {
                if (Math.abs(playerDPoints - playerLeftPoints) >= 2) {
                    break;
                }
            }

            if (playerDPoints > 21 && playerDPoints - playerLeftPoints >= 2) {
                System.out.println("Jogador da direita venceu!");
                break;
            } else if (playerLeftPoints > 21 && playerLeftPoints - playerDPoints >= 2) {
                System.out.println("Jogador da esquerda venceu!");
                break;
            }
        }

        if (playerDPoints > playerLeftPoints) {
            System.out.println("Jogador da direita venceu!");
        } else {
            System.out.println("Jogador da esquerda venceu!");
        }

        scanner.close();
    }
}

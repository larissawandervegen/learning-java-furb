import java.util.Scanner;

public class B2850 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String situacao;

        do {
            situacao = scanner.nextLine().trim();

            switch (situacao) {
                case "nenhuma":
                    System.out.println("português");
                    System.out.println();
                case "esquerda":
                    System.out.println("inglês");
                    System.out.println();
                case "direita":
                    System.out.println("francês");
                    System.out.println();
                case "as duas":
                    System.out.println("caiu");
                    break;
                default:
                    System.out.println("Situação desconhecida");
                    System.out.println();
                    break;
            }
        } while (!situacao.equals("as duas"));

        scanner.close();
    }
}

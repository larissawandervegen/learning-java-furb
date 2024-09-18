import java.util.Scanner;

public class AtividadeExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] palavras = nomeCompleto.split("\\s+");
        StringBuilder iniciais = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                iniciais.append(Character.toUpperCase(palavra.charAt(0)));
            }
        }

        System.out.println("Iniciais: " + iniciais.toString());

        String nomeMaiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome em letras maiúsculas: " + nomeMaiusculo);

        scanner.close();
    }
}
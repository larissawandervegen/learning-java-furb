import java.util.Scanner;

public class AtividadeExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o sexo (M/F): ");
        String sexo = scanner.nextLine().trim().toUpperCase();

        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }

        scanner.close();
    }
}

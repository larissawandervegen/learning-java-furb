import java.util.Scanner;

public class B1873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < C; i++) {
            String escolhaRajesh = scanner.next();
            String escolhaSheldon = scanner.next();

            String resultado = determinarVencedor(escolhaRajesh, escolhaSheldon);
            System.out.println(resultado);
        }

        scanner.close();
    }

    private static String determinarVencedor(String rajesh, String sheldon) {
        if (rajesh.equals(sheldon)) {
            return "empate";
        }

        switch (rajesh) {
            case "tesoura":
                if (sheldon.equals("papel") || sheldon.equals("lagarto")) {
                    return "rajesh";
                }
                break;
            case "papel":
                if (sheldon.equals("pedra") || sheldon.equals("spock")) {
                    return "rajesh";
                }
                break;
            case "pedra":
                if (sheldon.equals("lagarto") || sheldon.equals("tesoura")) {
                    return "rajesh";
                }
                break;
            case "lagarto":
                if (sheldon.equals("spock") || sheldon.equals("papel")) {
                    return "rajesh";
                }
                break;
            case "spock":
                if (sheldon.equals("tesoura") || sheldon.equals("pedra")) {
                    return "rajesh";
                }
                break;
        }

        return "sheldon";
    }
}

import java.util.Scanner;

public class AtividadeExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de uma fruta: ");
        String fruta = scanner.nextLine().toLowerCase();

        if (fruta.equals("amora") || fruta.equals("nectarina") || fruta.equals("ameixa") || fruta.equals("goiaba")) {
            System.out.println(fruta + " eu gosto");
        } else {
            System.out.println(fruta + " eu como mas não gosto");
        }

        scanner.close();
    }
}

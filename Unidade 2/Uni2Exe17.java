import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double horasTrabalhadas = scanner.nextDouble();
        double dep = scanner.nextDouble();

        double st = 10 * horasTrabalhadas;
        double sf = 60 * dep;
        double inss = st * 0.085;
        double ir  = st * 0.05;
        double sb = st + sf;
        double sl = sb - inss - ir;

        System.out.println(nome);
        System.out.println(sb);
        System.out.println(sl);

        scanner.close();
    }
}
import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1)Domingo, 2)Segunda,..., 7)Sábado): ");
        int firstDay = scanner.nextInt();

        System.out.print("Digite o número de dias do mês: ");
        int numDays = scanner.nextInt();

        if (firstDay < 1 || firstDay > 7) {
            System.out.println("Por favor, digite um valor válido para o dia da semana (1-7).");
        } else if (numDays < 1 || numDays > 31) {
            System.out.println("Por favor, digite um valor válido para o número de dias (1-31).");
        } else {
            System.out.println("D\tS\tT\tQ\tQ\tS\tS");

            int day = 1;

            for (int i = 1; i < firstDay; i++) {
                System.out.print("\t");
            }

            while (day <= numDays) {
                for (int i = firstDay; i <= 7 && day <= numDays; i++) {
                    System.out.print(day + "\t");
                    day++;
                }
                System.out.println();
                firstDay = 1;
            }
        }

        scanner.close();
    }
}

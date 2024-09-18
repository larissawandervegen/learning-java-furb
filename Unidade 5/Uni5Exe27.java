import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day;
        int productionMorning, productionEvening;
        char newWorker = '1';

        while (newWorker == '1') {
            // Leitura do dia do mês de abril
            System.out.print("Digite o dia do mês de abril (1 a 30): ");
            day = scanner.nextInt();

            while (day < 1 || day > 30) {
                System.out.println("Dia inválido");
                System.out.print("Digite o dia do mês de abril (1 a 30): ");
                day = scanner.nextInt();
            }

            System.out.print("Total de peças produzidas no turno da manhã: ");
            productionMorning = scanner.nextInt();

            System.out.print("Total de peças produzidas no turno da tarde: ");
            productionEvening = scanner.nextInt();

            double salary;
            if (day <= 15) {
                if (productionMorning >= 30 && productionEvening >= 30
                        && (productionMorning + productionEvening) > 100) {
                    salary = (productionMorning + productionEvening) * 0.80;
                } else {
                    salary = (productionMorning + productionEvening) * 0.50;
                }
            } else {
                salary = (productionMorning * 0.40) + (productionEvening * 0.30);
            }

            System.out.printf("Valor recebido: R$ %.2f%n", salary);

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            newWorker = scanner.next().charAt(0);
        }

        scanner.close();
    }
}

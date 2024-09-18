import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option, closedAcc = 0;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Encerrar a conta de um hóspede");
            System.out.println("2. Verificar número de contas encerradas");
            System.out.println("3. Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe o nome do hóspede: ");
                    String name = scanner.next();
                    System.out.print("Informe o número de diárias: ");
                    int numDiares = scanner.nextInt();

                    double serviceTax;
                    if (numDiares < 15) {
                        serviceTax = 7.50;
                    } else if (numDiares == 15) {
                        serviceTax = 6.50;
                    } else {
                        serviceTax = 5.00;
                    }

                    double totalPay = 50.00 * numDiares + serviceTax;
                    System.out.println("Hóspede: " + name);
                    System.out.println("Total a ser pago: R$ " + totalPay);
                    closedAcc++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + closedAcc);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (option != 3);

        scanner.close();
    }
}

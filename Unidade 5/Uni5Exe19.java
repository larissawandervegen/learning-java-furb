import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGot = 0;

        while (true) {
            System.out.print("Informe o valor da compra (ou 0 para finalizar): R$ ");
            double sellValue = scanner.nextDouble();

            if (sellValue == 0) {
                break;
            }

            double discount;
            if (sellValue > 500) {
                discount = 0.20;
            } else {
                discount = 0.15;
            }

            double discountValue = sellValue * discount;
            double totalPay = sellValue - discountValue;

            System.out.println("Valor da compra: R$ " + sellValue);
            System.out.println("Desconto: R$ " + discountValue);
            System.out.println("Total a pagar: R$ " + totalPay);

            totalGot += totalPay;
        }

        System.out.println("Total recebido pela loja ao final do dia: R$ " + totalGot);
        scanner.close();
    }
}

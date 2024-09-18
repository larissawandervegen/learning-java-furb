import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPurchase = 0;
        double totalSell = 0;
        double totalProfit = 0;

        int profitIn10 = 0;
        int profitB10n20 = 0;
        int profitB20 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria nº" + i);

            System.out.println("Nome da mercadoria:");
            String name = scanner.nextLine();

            System.out.println("Preço de compra:");
            double priceB = scanner.nextDouble();

            System.out.println("Preço de venda:");
            double priceS = scanner.nextDouble();

            double profitPer = ((priceS - priceB) / priceB) * 100;

            totalPurchase += priceB;
            totalSell += priceS;
            totalProfit += priceS - priceB;

            if (profitPer < 10) {
                profitIn10++;
            } else if (profitPer <= 20) {
                profitB10n20++;
            } else {
                profitB20++;
            }

            scanner.nextLine();
        }

        System.out.println("\nQuantidade de mercadorias com lucro < 10%: " + profitIn10);
        System.out.println("Quantidade de mercadorias com 10% <= lucro <= 20%: " + profitB10n20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + profitB20);

        System.out.println("\nValor total de compra de todas as mercadorias: R$" + totalPurchase);
        System.out.println("Valor total de venda de todas as mercadorias: R$" + totalSell);
        System.out.println("Lucro total: R$" + totalProfit);

        scanner.close();
    }
}

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char proceed;
        do {
            System.out.print("Informe o nome do vendedor: ");
            String name = scanner.nextLine();

            System.out.print("Informe o número de produtos vendidos: ");
            int numProducts = scanner.nextInt();

            double totalSell = 0;
            for (int i = 1; i <= numProducts; i++) {
                System.out.println("Produto " + i + ":");
                System.out.print("Preço unitário: R$ ");
                double uPrice = scanner.nextDouble();
                System.out.print("Quantidade vendida: ");
                int amount = scanner.nextInt();

                double sellProduct = uPrice * amount;
                totalSell += sellProduct;
            }

            double sallary = totalSell * 0.30;

            System.out.println("\nRelatório do vendedor " + name + ":");
            System.out.println("Total de vendas: R$ " + totalSell);
            System.out.println("Salário: R$ " + sallary);

            System.out.print("\nDeseja digitar os dados de mais um vendedor? Responda s (SIM) ou n (NÂO): ");
            proceed = scanner.next().charAt(0);
            scanner.nextLine();
        } while (proceed == 's' || proceed == 'S');

        scanner.close();
    }
}

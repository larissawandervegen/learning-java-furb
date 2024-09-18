import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int value = scanner.nextInt();

        int[] money = { 20, 10, 5, 2, 1 };
        int[] moneyAmount = new int[money.length];

        int remainValue = value;
        for (int i = 0; i < money.length; i++) {
            if (remainValue >= money[i]) {
                moneyAmount[i] = remainValue / money[i];
                remainValue = remainValue % money[i];
            }
        }

        System.out.println("Para o valor " + value + ", você receberá:");
        for (int i = 0; i < money.length; i++) {
            if (moneyAmount[i] > 0) {
                System.out.println(moneyAmount[i] + " cédula(s) de " + money[i] + " reais");
            }
        }

        scanner.close();
    }
}

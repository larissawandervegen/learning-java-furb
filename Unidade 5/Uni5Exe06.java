import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalHight = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe a altura da pessoa nº" + i + ": ");
            double hight = scanner.nextDouble();
            totalHight += hight;
        }

        double avg = totalHight / 20;
        System.out.println("A média de altura das 20 pessoas é: " + avg);

        scanner.close();
    }
}

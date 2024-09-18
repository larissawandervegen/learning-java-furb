import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas do Triângulo de Floyd: ");
        int num = scanner.nextInt();

        System.out.println("Triângulo de Floyd com " + num + " linhas:");

        int currentNum = 1;
        for (int line = 1; line <= num; line++) {
            for (int coluna = 1; coluna <= line; coluna++) {
                System.out.print(currentNum + " ");
                currentNum++;
            }
            System.out.println();
        }
        scanner.close();
    }
}

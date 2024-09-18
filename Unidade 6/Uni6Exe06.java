import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe a quantidade de posições desejada: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        readArray(scanner, numbers);

        boolean found = findNumber(scanner, numbers);

        if (found) {
            System.out.println("O número está no array.");
        } else {
            System.out.println("O número não está no array.");
        }

        scanner.close();
    }

    public static void readArray(Scanner scanner, int[] numbers) {
        System.out.println("Vamos popular o array!");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public static boolean findNumber(Scanner scanner, int[] numbers) {
        System.out.print("Qual número você quer verificar se está no array? ");
        int num = scanner.nextInt();
        
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return true;
            }
        }
        return false;
    }
}

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int soma = a + b;
        
        System.out.print("SOMA = ", soma);
        
        scanner.close();
    }
}

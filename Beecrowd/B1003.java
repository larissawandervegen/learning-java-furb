import java.io.IOException;
import java.util.Scanner;

public class B1003 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
        
        scanner.close();
    }
}

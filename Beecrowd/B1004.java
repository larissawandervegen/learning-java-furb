import java.io.IOException;
import java.util.Scanner;

public class B1004{
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int PROD = a * b;
        
        System.out.println("PROD = " + PROD);
        
        scanner.close();
 
    }
 
}
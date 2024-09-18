import java.util.Scanner;

public class B1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivo = 0;
        for (int i = 1; i <= 6; i++) {
            int num = Integer.parseInt(scanner.next());
            
            if (num > 0) {
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
        scanner.close();
    }
}

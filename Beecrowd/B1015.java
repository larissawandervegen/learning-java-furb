import java.util.Scanner;

public class B1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.3f%n", distancia);
        
        scanner.close();
    }
}

// Ler (x1)

// distancia = sqrt(((x2 - x1)^2 + ((y2 - y1)^2));

// escrever(distancia)
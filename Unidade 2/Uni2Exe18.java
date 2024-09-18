import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = scanner.nextDouble();
        double a = scanner.nextDouble();

        double area  = c * a;
        double compra = area * 9;
        double adicional = area % 1;
        if (adicional > 0) {
            compra = compra + 1;
        }
        double custo = compra * 12.25;
        System.out.println(custo);

        scanner.close();
    }
}

// ler (c);

// ler (a);

// double area = c * a;

// double compra = area * 9;

// double adicional = area % 1 (pegar o resto);

// se (adicional > 0){

// compra = compra + 1;

// double custo = compra * 12,25;
// }

// escrever (custo)
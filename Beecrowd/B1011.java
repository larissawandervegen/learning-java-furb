import java.io.IOException;
import java.util.Scanner;

public class B1011 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double tri = (a * c) / 2;
        double circ = 3.14159 * Math.pow(c, 2);
        double trap = ((a + b) * c) / 2;
        double quad = b * b;
        double ret = a * b;

        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO: %.3f%n", ret);

        scanner.close();
    }
}


// double a, b, c, tri, circ, trap, quad, ret.
// Ler (a)
// Ler (b)
// Ler (c)
// TRI = A * C / 2
// CIRC = 3,14159 * (C ^ 2)
// TRAP = ((A + B) - C) / 2
// QUAD = B * B
//  RET = A * B
// escreva (tri);
// escreva (circ);
// escreva (trap);
// escreva (quad);
// escreva (ret);
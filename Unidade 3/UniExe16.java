import java.util.Scanner;

public class UniExe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o valor da compra: R$");
        int valorCompra = scanner.nextInt();
        
        System.out.print("Insira o valor pago: R$");
        int valorPago = scanner.nextInt();
        
        int troco = valorPago - valorCompra;
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10;
        int notas1 = troco;
        
        System.out.println("Número mínimo de notas de 100 reais: " + notas100);
        System.out.println("Número mínimo de notas de 10 reais: " + notas10);
        System.out.println("Número mínimo de notas de 1 real: " + notas1);
        
        scanner.close();
    }
}  
import java.util.Scanner;

public class UniExe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a altura da lata de óleo?");
        double altura = scanner.nextDouble();

        System.out.println("Qual o raio da lata de óleo?");
        double raio = scanner.nextDouble();

        double volume = 3.14 * (raio * raio) * altura;
        
        System.out.println("O volume da lata de óleo é igual a " + volume);

        scanner.close();
    }
}

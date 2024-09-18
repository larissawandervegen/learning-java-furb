import java.util.Scanner;

public class UniExe15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro de até 3 dígitos: ");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int restoCentenas = numero % 100;
        int dezenas = restoCentenas / 10;
        int unidades = restoCentenas % 10;

        System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

        scanner.close();
    }
}  
import java.util.Scanner;

public class UniExe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a temperatura em C°?");
        double grausC = scanner.nextDouble();

        double grausF =  ((9/5) * grausC) + 32;

        System.out.println("A temperatura em F° é igual a " +  grausF);

        scanner.close();
    }
}

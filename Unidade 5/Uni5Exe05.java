import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        int num = scanner.nextInt();
        int value = 8;

        if (num <=2) {
            System.out.println("A quantidade de termos deve ser maior que 2.");
        }else{
            for (int i = 0; i <= num; i++) {
                System.out.println(value);
                i++;
                if (i <= num) {
                    System.out.println(value + 2);
                }
                value*=2;
            }
        }
        scanner.close();
    }
}

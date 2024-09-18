import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 20; i++){
            System.out.print("Digite o " + i + "º número: ");

            int valor = scanner.nextInt();

            if (valor % 2==0) {
                System.out.println(valor + " é par!");  
            }
            else{
                System.out.println(valor + " é impar!");  
            }
           
        }

        scanner.close();
    }
}

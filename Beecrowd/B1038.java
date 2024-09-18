import java.util.Scanner;

public class B1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o código do produto:");
        int cod = scanner.nextInt();
        System.out.println("Informe a quantidade:");
        int qtd = scanner.nextInt();
        
        if (cod == 1){
            double total = 4 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }else if(cod == 2){
            double total = 4.50 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }else if(cod == 3){
            double total = 5 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }else if(cod == 4){
            double total = 2 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }else if(cod == 5){
            double total = 1.50 * qtd;
            System.out.printf("Total: R$ %.2f", total);
        }
        scanner.close();
    }
}

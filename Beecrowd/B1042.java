import java.util.Scanner;

public class B1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        if (num1 < num2 && num1 < num2) {
            if (num2 < num3) {
                primeiro = num1;
                segundo = num2;
                terceiro = num3;
            }else {
                primeiro = num1;
                segundo = num3;
                terceiro = num2;
            }
        }
        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                primeiro = num2;
                segundo = num1;
                terceiro = num3;
            }else{
                primeiro = num2;
                segundo = num3;
                terceiro = num1;
            }
        }
        if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                primeiro = num3;
                segundo = num1;
                terceiro = num2;
            }else{
                primeiro = num3;
                segundo = num2;
                terceiro = num1;
            }
        }
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        scanner.close();
    }
}

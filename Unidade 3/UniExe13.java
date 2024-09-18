import java.util.Scanner;

public class UniExe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoAzu = 12.50;

        System.out.print("Digite o comprimento da parede em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a altura da parede em metros: ");
        double altura = scanner.nextDouble();

        double areaParede = comprimento * altura;
        double numAzu = (int) Math.ceil(areaParede * 9); 
        double total = numAzu * precoAzu;

        System.out.println("O total da compra de azulejos é R$" + total);

        scanner.close();
    }
}  
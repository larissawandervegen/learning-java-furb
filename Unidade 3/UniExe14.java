import java.util.Scanner;

public class UniExe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo gasto (em horas): ");
        double tempo = scanner.nextDouble();

        double velocidade = distancia / tempo;
        double combustivel = distancia / 12.0;

        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Combustível gasto: " + combustivel + " litros");

        scanner.close();
    }
}  
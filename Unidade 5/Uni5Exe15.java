import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome e a nota das duas provas (ou 'fim' para encerrar):");

        String name = "";
        double grade1, grade2;

        while (!name.equalsIgnoreCase("fim")) {
            System.out.print("Nome: ");
            name = scanner.nextLine();

            if (!name.equalsIgnoreCase("fim")) {
                System.out.print("Nota da prova 1: ");
                grade1 = scanner.nextDouble();
                
                System.out.print("Nota da prova 2: ");
                grade2 = scanner.nextDouble();

                double avg = (grade1 + grade2) / 2;

                System.out.println("Média de " + name + " é igual à: " + avg);
                
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

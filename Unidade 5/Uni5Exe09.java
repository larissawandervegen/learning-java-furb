import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigStudents = 0;

        System.out.print("Informe a quantidade de alunos: ");
        int classes = scanner.nextInt();

        for (int i = 0; i < classes; i++) {
            System.out.println("Informe o nome do aluno nº" + (i +1) + " : ");
            String name = scanner.next();
            System.out.println("Informe a idade do aluno nº" + (i + 1) + " : ");
            int age = scanner.nextInt();

            if (age == 18) {
                System.out.println(name + " tem 18 anos.");
            }else if (age > 20) {
                bigStudents++;
                System.out.println(bigStudents + " aluno(s) tem mais de 20 anos.");
            }

        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura e o sexo de cada pessoa (ou 0 para encerrar):");

        double hight, totalHight = 0;
        char sex;
        int countWomen = 0, countPpl = 0;

        while (true) {
            System.out.print("Altura (em metros): ");
            hight = scanner.nextDouble();
            
            if (hight == 0) {
                break; 
            }

            System.out.print("Sexo (M/F): ");
            sex = scanner.next().charAt(0);
            sex = Character.toUpperCase(sex); 

            if (sex == 'F') {
                totalHight += hight;
                countWomen++;
            }

            totalHight += hight;
            countPpl++;
        }

        double avgWoman = countWomen > 0 ? totalHight / countWomen : 0;
        
        double avgGroup = countPpl > 0 ? totalHight / countPpl : 0;

        System.out.println("Média de altura das mulheres: " + avgWoman);
        System.out.println("Média de altura do grupo: " + avgGroup);

        scanner.close();
    }
}

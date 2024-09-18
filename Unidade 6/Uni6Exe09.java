import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeople = 30;
        int[] gender = new int[totalPeople];
        double[] cinemaGrade = new double[totalPeople];
        int[] age = new int[totalPeople];

        for (int i = 0; i < totalPeople; i++) {
            System.out.println("Cliente " + (i+1) + ":");
            System.out.print("Sexo: \n 1)Feminino\n 2) masculino\n ");
            gender[i] = scanner.nextInt();
            System.out.print("Nota para o cinema (de 0 a 10): ");
            cinemaGrade[i] = scanner.nextInt();
            System.out.print("Idade: ");
            age[i] = scanner.nextInt();
        }

        double avgGrade = calculateAvg(cinemaGrade);
        double avgManGrade = calculateMenAvg(gender, cinemaGrade);
        double youngestWomanGrade = findYoungestWomanGrade(gender, cinemaGrade, age);
        int woman50PlusGrade = findWoman50PlusGrade(gender, cinemaGrade, age, avgGrade);

        System.out.printf("Média: " + avgGrade);
        System.out.printf("Média homens: " + avgManGrade);
        System.out.printf("A nota da mulher mais jovem é: " + youngestWomanGrade);
        System.out.println("O total de mulheres com mais de 50 anos é igual a: " + woman50PlusGrade);

        scanner.close();
    }

    public static double calculateAvg(double[] cinemaGrade){
        double avgGrade = 0;
        for (int i = 0; i < cinemaGrade.length; i++) {
            avgGrade+=cinemaGrade[i];
        }
        return avgGrade/cinemaGrade.length;
    }

    public static double calculateMenAvg(int[] gender, double[] cinemaGrade){
        double avgGrade = 0;
        int totalMen = 0;
        for (int i = 0; i < cinemaGrade.length; i++) {
            if (gender[i] == 2) {
                avgGrade+=cinemaGrade[i];
                totalMen++;
            }
        }
        return avgGrade/totalMen;
    }

    public static double findYoungestWomanGrade(int[] gender, double[] cinemaGrade, int [] age){
        double youngestGrade = -1;
        int youngestWomanAge = -1;

        for (int i = 0; i < cinemaGrade.length; i++) {
            if (gender[i] == 1) {
                if (youngestWomanAge == -1 || age[i] < youngestWomanAge){
                    youngestWomanAge = age[i];
                    youngestGrade = cinemaGrade[i];
                }
            }
        }
        return youngestGrade;
    }

    public static int findWoman50PlusGrade(int[] gender, double[] cinemaGrade, int [] age, double avgGrade){
        int womanAge = 50;
        int womanCounter = 0;

        for (int i = 0; i < cinemaGrade.length; i++) {
            if (gender[i] == 1) {
                if (age[i] >= womanAge && cinemaGrade[i] >= avgGrade){
                    womanCounter++;
                }
            }
        }
        return womanCounter;
    }

}

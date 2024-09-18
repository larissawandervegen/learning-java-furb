public class Uni5Exe21 {
    public static void main(String[] args) {
        double chicoHight = 1.50;
        double zeHight = 1.10;
        double chicoGrowth = 0.02;
        double zeGrowth = 0.03;
        int years = 0;

        while (zeHight <= chicoHight) {
            chicoHight += chicoGrowth;
            zeHight += zeGrowth;
            years++;
        }

        System.out.println("Zé só será maior que Chico em " + years + " anos.");
    }
}

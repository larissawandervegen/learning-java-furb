public class Uni5Exe11 {
    public static void main(String[] args) {
        int hoursDay = 16;
        long totalBroken = 0;
        long broken = 1;

        for (int n = 1; n <= hoursDay; n++) {
            System.out.println("Hora " + n + " tem " + broken + " biscoitos quebrados");
            totalBroken += broken;
            broken *= 3;
        }
        System.out.println("O total de biscoitos quebrados em um dia é: " + totalBroken);
    }
        
        
}


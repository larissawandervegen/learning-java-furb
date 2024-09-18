public class Uni5Exe02 {
    public static void main(String[] args) {
        
        int countEven = 0;
        int countOdd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                countEven += i; 
            } else {
                countOdd += i; // 
            }
        }

        System.out.println("A soma dos números pares é igual à: " + countEven);
        System.out.println("A soma dos números ímpares é igual à: " + countOdd);
    }
    
}

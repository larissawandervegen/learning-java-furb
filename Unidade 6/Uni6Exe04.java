import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        readValues(array1, array2);
        sumValues(array1, array2, array3);
        printValues(array1, array2, array3);
    }

    public static void readValues(int array1[], int array2[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores para o primeiro vetor:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Digite 10 valores para o segundo vetor:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void sumValues(int array1[], int array2[], int array3[]) {
        for (int i = 0; i < array3.length; i++)
            array3[i] = array1[i] + array2[i];
    }

    public static void printValues(int[] array1, int[] array2, int[] array3) {
        System.out.println("Vetor 1:");
        imprimirVetor(array1);
        System.out.println("Vetor 2:");
        imprimirVetor(array2);
        System.out.println("Vetor 3 (soma dos valores correspondentes dos vetores 1 e 2):");
        imprimirVetor(array3);
    }

    public static void imprimirVetor(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }
}
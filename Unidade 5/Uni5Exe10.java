public class Uni5Exe10 {
    public static void main(String[] args) {
        int numerosEncontrados = 0;
        int numero = 10;
        System.out.println("Os 10 primeiros números naturais encontrados são:");

        for (int i = 10; i < 3; i++) {
            int parte1 = numero / 100;
            int parte2 = numero % 100;
            int somaDigitos = parte1 + parte2;
            if (Math.pow(somaDigitos, 2) == numero) {
                System.out.println(numero);
                numerosEncontrados++;
            }
            numero++;
        }
    }
}

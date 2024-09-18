import java.util.Scanner;

public class B1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o horário de início: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Informe o horário de fim: ");
        int horaFim = scanner.nextInt();
        int duracao = 0;

        if (horaInicial == horaFim) {
            duracao = 24;
        }else if (horaInicial > horaFim) {
            horaFim = horaFim + 24;
            duracao = horaFim - horaInicial;
        }else {
            duracao = horaFim - horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        scanner.close();
    }
}

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
// Entrada
// A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
// Saída
// Apresente a duração do jogo conforme exemplo abaixo.
// se hi = hf d = 24
// senao
// se hi > hfhf = hf +24
// d = hf - hisenoa
// d = hf - hi


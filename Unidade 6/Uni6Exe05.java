import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] herAnswers = new String[5];
        String[] hisAnswers = new String[5];
        readAnswers(scanner, "Ela", herAnswers);
        readAnswers(scanner, "Ele", hisAnswers);

        int afinity = calculateAfinity(herAnswers, hisAnswers);
        informAfinity(afinity);

        scanner.close();
    }

    public static void readAnswers(Scanner scanner, String id, String answer[]) {
        String[] questions = {
                "Gosta de música sertaneja?",
                "Gosta de futebol?",
                "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta da Oktoberfest?"
        };

        System.out.println(id + " responde:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answer[i] = scanner.next().trim().toLowerCase();
        }

    }

    public static int calculateAfinity(String[] herAnswers, String[] hisAnswers) {
        int afinity = 0;
        for (int i = 0; i < herAnswers.length; i++) {
            if (herAnswers[i].equals(hisAnswers[i])) {
                afinity += 3;
            } else if (herAnswers[i].equals("ind") || hisAnswers[i].equals("ind")) {
                afinity += 1;
            } else if ((herAnswers[i].equals("sim") && hisAnswers[i].equals("nao")) ||
                    (herAnswers[i].equals("nao") && hisAnswers[i].equals("sim"))) {
                afinity -= 2;
            }
        }
        return afinity;
    }

    public static void informAfinity(int afinity) {
        String message;
        if (afinity >= 15) {
            message = "Casem!";
        } else if (afinity >= 10 && afinity <= 14) {
            message = "Vocês têm muita coisa em comum!";
        } else if (afinity >= 5 && afinity <= 9) {
            message = "Talvez não dê certo :(";
        } else if (afinity >= 0 && afinity <= 4) {
            message = "Vale um encontro.";
        } else if (afinity >= -9 && afinity <= -1) {
            message = "Melhor não perder tempo";
        } else {
            message = "Vocês se odeiam!";
        }
        System.out.println("O índice de afinidade entre o rapaz e a moça é: " + afinity + ". " + message);
    }
}

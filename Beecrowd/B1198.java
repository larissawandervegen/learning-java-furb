import java.util.Scanner;

public class B1198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long hashmatSoldiers = scanner.nextLong();
            long opponentSoldiers = scanner.nextLong();

            long difference = Math.abs(hashmatSoldiers - opponentSoldiers);

            System.out.println(difference);
        }

        scanner.close();
    }
}

package Week4Exercises;

import java.util.Scanner;

import static java.lang.System.exit;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 0; i < judgesCount; i++) {
            String judgeName = scanner.nextLine();
            double judgeScore = Double.parseDouble(scanner.nextLine());

            totalPoints += judgeName.length() * judgeScore / 2;

            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                exit(0);
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);

    }
}

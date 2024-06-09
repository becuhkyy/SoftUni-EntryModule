package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayerName = "";
        int bestPlayerGoals = 0;

        String playerName = scanner.nextLine();

        while (!playerName.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestPlayerGoals) {
                bestPlayerName = playerName;
                bestPlayerGoals = goals;
            }

            if (goals >= 10) {
                break;
            }

            playerName = scanner.nextLine();
        }

        if (bestPlayerGoals >= 3) {
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", bestPlayerName, bestPlayerGoals);
        } else
            System.out.printf("%s is the best player!%nHe has scored %d goals.", bestPlayerName, bestPlayerGoals);

    }
}

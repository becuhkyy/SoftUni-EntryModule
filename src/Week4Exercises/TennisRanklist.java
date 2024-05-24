package Week4Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int tournamentPoints = 0;
        int victories = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String position = scanner.nextLine();

            switch (position) {
                case "W":
                    tournamentPoints += 2000;
                    victories++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d\n", initialPoints + tournamentPoints);
        System.out.printf("Average points: %d\n", tournamentPoints / tournamentsCount);
        System.out.printf("%.2f%%\n", (double) victories / tournamentsCount * 100.00);
    }
}

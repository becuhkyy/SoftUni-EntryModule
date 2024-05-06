package Week3Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spendings = 0;
        String accomodation = "";
        String destination = "";

        if (budget <= 100) {
            if (season.equals("summer")) {
                spendings = budget * 0.3;
                accomodation = "Camp";
            } else {
                spendings = budget * 0.7;
                accomodation = "Hotel";
            }
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                spendings = budget * 0.4;
                accomodation = "Camp";
            } else {
                spendings = budget * 0.8;
                accomodation = "Hotel";
            }
            destination = "Balkans";
        } else {
            spendings = budget * 0.9;
            accomodation = "Hotel";
            destination = "Europe";
        }


        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", accomodation, spendings);
    }
}

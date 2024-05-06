package Week3Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vacationLength = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = vacationLength - 1;
        double amount = 0;

        switch (roomType) {
            case "room for one person":
                amount = nights * 18.00;
                break;

            case "apartment":
                amount = nights * 25.00;

                if (nights < 10)
                    amount *= 0.7;
                else if (nights <= 15)
                    amount *= 0.65;
                else
                    amount *= 0.5;

                break;

            case "president apartment":
                amount = nights * 35.00;

                if (nights < 10)
                    amount *= 0.9;
                else if (nights <= 15)
                    amount *= 0.85;
                else
                    amount *= 0.8;

                break;
        }

        if (rating.equals("positive"))
            amount *= 1.25;
        else if (rating.equals("negative"))
            amount *= 0.9;

        System.out.printf("%.2f", amount);
    }
}

package Week2Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double pricePerStatis = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double statistTotalPrice = statistCount * pricePerStatis;

        if (statistCount > 150)
            statistTotalPrice -= statistTotalPrice * 0.1;

        if (budget >= decorPrice + statistTotalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - decorPrice - statistTotalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - decorPrice - statistTotalPrice));
        }
    }
}

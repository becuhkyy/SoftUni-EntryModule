package Week2Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramStics = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250.00;
        double processorsPrice = (videoCardsPrice * 0.35) * processors;
        double ramSticksPrice = (videoCardsPrice * 0.10) * ramStics;

        double totalPrice = videoCardsPrice + processorsPrice + ramSticksPrice;

        if (videoCards > processors)
            totalPrice -= totalPrice * 0.15;
        
        if (budget >= totalPrice)
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        else
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalPrice));
    }
}

package Exam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveStories = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int luckySurprises = Integer.parseInt(scanner.nextLine());

        int totalItems = loveStories + waxRoses + keychains + caricatures + luckySurprises;

        double total = (loveStories * 0.6) + (waxRoses * 7.20) + (keychains * 3.60) + (caricatures * 18.20) + (luckySurprises * 22.00);

        if (totalItems > 25)
            total -= total * 0.35;

        total -= total * 0.10;


        if (total - partyPrice > 0) {
            System.out.printf("Yes! %.2f lv left.", total - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(total - partyPrice));
        }
    }
}

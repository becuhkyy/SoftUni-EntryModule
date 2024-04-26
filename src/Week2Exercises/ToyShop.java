package Week2Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        final double PUZZLE_PRICE = 2.60;
        final double DOLL_PRICE = 3.00;
        final double BEAR_PRICE = 4.10;
        final double MINION_PRICE = 8.20;
        final double TRUCK_PRICE = 2.00;

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double total = puzzles * PUZZLE_PRICE +
                dolls * DOLL_PRICE +
                bears * BEAR_PRICE +
                minions * MINION_PRICE +
                trucks * TRUCK_PRICE;

        int totalToysCount = puzzles + dolls + bears + minions + trucks;

        if (totalToysCount >= 50)
            total -= total * 0.25;

        total -= total * 0.1;


        if (total >= vacationPrice)
            System.out.printf("Yes! %.2f lv left.", total - vacationPrice);
        else
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(total - vacationPrice));
    }
}

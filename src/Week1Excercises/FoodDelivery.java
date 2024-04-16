package Week1Excercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        final double CHICKEN_MENU_PRICE = 10.35;
        final double FISH_MENU_PRICE = 12.40;
        final double VEGETARIAN_MENU_PRICE = 8.15;
        final double DELIVERY_FEE = 2.50;

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double priceOfMenus = chickenMenus * CHICKEN_MENU_PRICE +
                fishMenus * FISH_MENU_PRICE +
                vegetarianMenus * VEGETARIAN_MENU_PRICE;

        double dessert = priceOfMenus * 0.20;

        double total = priceOfMenus + dessert + DELIVERY_FEE;

        System.out.println(total);
    }
}

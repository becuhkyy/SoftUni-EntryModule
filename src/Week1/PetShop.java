package Week1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        double catFoodPrice = 4.0;
        double dogFoodPrice = 2.5;

        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.1f lv.", dogFood * dogFoodPrice + catFood * catFoodPrice);
    }
}

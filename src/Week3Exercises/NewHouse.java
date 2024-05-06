package Week3Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        final double ROSE_PRICE = 5.00;
        final double DAHLIA_PRICE = 3.80;
        final double TULIP_PRICE = 2.80;
        final double NARCISSUS_PRICE = 3.00;
        final double GLADIOLUS_PRICE = 2.50;

        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double amount = 0;

        switch (flowersType) {
            case "Roses":
                amount = flowers * ROSE_PRICE;

                if (flowers > 80)
                    amount -= amount * 0.1;

                break;
            case "Dahlias":
                amount = flowers * DAHLIA_PRICE;

                if (flowers > 90)
                    amount -= amount * 0.15;

                break;
            case "Tulips":
                amount = flowers * TULIP_PRICE;

                if (flowers > 80)
                    amount -= amount * 0.15;

                break;
            case "Narcissus":
                amount = flowers * NARCISSUS_PRICE;

                if (flowers < 120)
                    amount *= 1.15;

                break;
            case "Gladiolus":
                amount = flowers * GLADIOLUS_PRICE;

                if (flowers < 80)
                    amount *= 1.2;

                break;
        }

        if (amount <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flowersType, budget - amount);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", amount - budget);
        }
    }
}

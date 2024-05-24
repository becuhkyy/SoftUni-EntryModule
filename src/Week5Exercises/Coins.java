package Week5Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        int totalCoins = 0;

        // Silly, but we have only covered for,while and if-else so far :)
        while (change != 0) {
            if (change >= 2) {
                coins = (int) (change / 2.0);
                totalCoins += coins;
                change -= coins * 2;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 1) {
                coins = (int) (change);
                totalCoins += coins;
                change -= coins;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 0.5) {
                coins = (int) (change / 0.5);
                totalCoins += coins;
                change -= coins * 0.5;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 0.2) {
                coins = (int) (change / 0.2);
                totalCoins += coins;
                change -= coins * 0.2;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 0.1) {
                coins = (int) (change / 0.1);
                totalCoins += coins;
                change -= coins * 0.1;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 0.05) {
                coins = (int) (change / 0.05);
                totalCoins += coins;
                change -= coins * 0.05;
                change = Math.round(change * 100.0) / 100.0;
            } else if (change >= 0.02) {
                coins = (int) (change / 0.02);
                totalCoins += coins;
                change -= coins * 0.02;
                change = Math.round(change * 100.0) / 100.0;
            } else {
                coins = (int) (change / 0.01);
                totalCoins += coins;
                change -= coins * 0.01;
                change = Math.round(change * 100.0) / 100.0;
            }
        }

        System.out.println(totalCoins);
    }
}

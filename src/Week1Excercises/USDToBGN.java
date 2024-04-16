package Week1Excercises;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {

        double EXCHANGE_RATE = 1.79549;

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        System.out.println(usd * EXCHANGE_RATE);
    }
}

package Week5;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;

        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(input);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n", sum);
            balance += sum;

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", balance);
    }
}

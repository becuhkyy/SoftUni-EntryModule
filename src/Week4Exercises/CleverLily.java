package Week4Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += i * 5.00 - 1;
            } else {
                sum += toyPrice;
            }
        }

        if (sum < washingMachinePrice) {
            System.out.printf("No! %.2f", Math.abs(sum - washingMachinePrice));
        } else {
            System.out.printf("Yes! %.2f", Math.abs(sum - washingMachinePrice));
        }
    }
}

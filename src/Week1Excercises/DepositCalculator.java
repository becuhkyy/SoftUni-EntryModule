package Week1Excercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositDuration = Integer.parseInt(scanner.nextLine());
        //Inline convert to percent by dividing by 100
        double yearlyInterestRate = Double.parseDouble(scanner.nextLine()) / 100;

        double interest = depositAmount +
                (depositDuration * ((depositAmount * yearlyInterestRate) / 12));

        System.out.println(interest);
    }
}

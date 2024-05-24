package Week5Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int consecutiveSpendings = 0;
        int days = 0;

        while (savedMoney < vacationCost && consecutiveSpendings < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "spend":
                    savedMoney -= money;
                    consecutiveSpendings++;
                    if (savedMoney < 0) {
                        savedMoney = 0;
                    }
                    break;
                case "save":
                    savedMoney += money;
                    consecutiveSpendings = 0;
                    break;
            }

            days++;
        }

        if (consecutiveSpendings == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else if (savedMoney >= vacationCost) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}

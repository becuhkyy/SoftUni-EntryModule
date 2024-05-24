package Week4Exercises;

import java.util.Scanner;

import static java.lang.System.exit;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < openTabsCount; i++) {
            String tabName = scanner.nextLine();

            switch (tabName) {
                case "Facebook":
                    salary -= 150;
                    if (salary <= 0) {
                        System.out.println("You have lost your salary.");
                        exit(1);
                    }
                    break;
                case "Instagram":
                    salary -= 100;
                    if (salary <= 0) {
                        System.out.println("You have lost your salary.");
                        exit(1);
                    }
                    break;
                case "Reddit":
                    salary -= 50;
                    if (salary <= 0) {
                        System.out.println("You have lost your salary.");
                        exit(1);
                    }
                    break;
            }
        }

        System.out.println(salary);
    }
}

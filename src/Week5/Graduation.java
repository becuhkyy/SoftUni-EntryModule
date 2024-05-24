package Week5;

import java.util.Scanner;

import static java.lang.System.exit;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        double sumScore = 0;
        int failedAttempts = 0;

        while (grade <= 12) {
            if (failedAttempts >= 2) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                exit(1);
            }

            double score = Double.parseDouble(scanner.nextLine());

            if (score < 4.0) {
                failedAttempts++;
                continue;
            }

            failedAttempts = 0;
            sumScore += score;
            grade++;
        }

        System.out.printf("%s graduated. Average grade: %.2f", name, sumScore / 12);
    }
}

package Week5Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        int poorGrades = 0;
        int gradesSum = 0;
        int problemsCount = 0;
        String lastProblem = "";
        boolean hasFailed = true;

        while (poorGrades < maxPoorGrades) {
            String problemName = scanner.nextLine();

            if (problemName.equals("Enough")) {
                hasFailed = false;
                break;
            }

            lastProblem = problemName;

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                poorGrades++;
            }

            gradesSum += grade;
            problemsCount++;

        }

        if (hasFailed) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
            System.out.printf("Average score: %.2f\n", (double) gradesSum / problemsCount);
            System.out.printf("Number of problems: %d\n", problemsCount);
            System.out.printf("Last problem: %s\n", lastProblem);
        }
    }
}

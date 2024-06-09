package Week6Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());


        String presentationName = scanner.nextLine();

        double totalScore = 0;
        int presentationCount = 0;

        while (!presentationName.equals("Finish")) {
            presentationCount++;

            double score = 0;

            for (int i = 0; i < juryCount; i++) {
                score += Double.parseDouble(scanner.nextLine());
            }

            score = score / juryCount;
            totalScore += score;
            System.out.printf("%s - %.2f.%n", presentationName, score);

            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalScore / presentationCount);
    }
}

package Week5Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;
        boolean isGoingHome = false;

        while (totalSteps < 10000 && !isGoingHome) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                isGoingHome = true;
                input = scanner.nextLine();
            }

            int steps = Integer.parseInt(input);
            totalSteps += steps;
        }

        if (totalSteps > 10000) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", totalSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}

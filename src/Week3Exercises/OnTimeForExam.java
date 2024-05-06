package Week3Exercises;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());

        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int arrivalTimeInMinutes = arrivalMinutes + arrivalHour * 60;
        int examTimeInMinutes = examMinutes + examHour * 60;

        int diff = arrivalTimeInMinutes - examTimeInMinutes;

        if (diff < -30) {
            System.out.println("Early");

            if (diff <= -60)
                System.out.printf("%d:%02d hours before the start", Math.abs(diff) / 60, Math.abs(diff) % 60);
            else
                System.out.printf("%d minutes before the start", Math.abs(diff));

        } else if (diff <= 0) {
            System.out.println("On time");

            if (diff != 0)
                System.out.printf("%d minutes before the start", Math.abs(diff));

        } else {
            System.out.println("Late");

            if (diff >= 60)
                System.out.printf("%d:%02d hours after the start", diff / 60, diff % 60);
            else
                System.out.printf("%d minutes after the start", diff);
        }
    }
}

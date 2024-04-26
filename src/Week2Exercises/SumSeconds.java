package Week2Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalSeconds = firstTime + secondTime + thirdTime;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}

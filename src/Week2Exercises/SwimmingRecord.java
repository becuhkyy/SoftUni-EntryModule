package Week2Exercises;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double resistanceTimeAdjustment = ((int) (distance / 15)) * 12.5;
        double totalTime = distance * timePerMeter + resistanceTimeAdjustment;

        if (currentRecord <= totalTime)
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - currentRecord);
        else
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);

    }
}

package Week4Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int musalaPeople = 0;
        int monblanPeople = 0;
        int kilimandzharoPeople = 0;
        int k2People = 0;
        int everestPeople = 0;


        for (int i = 0; i < groupsCount; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());

            if (groupSize <= 5) {
                musalaPeople += groupSize;
            } else if (groupSize <= 12) {
                monblanPeople += groupSize;
            } else if (groupSize <= 25) {
                kilimandzharoPeople += groupSize;
            } else if (groupSize <= 40) {
                k2People += groupSize;
            } else {
                everestPeople += groupSize;
            }
        }

        double totalPeople = musalaPeople + monblanPeople + kilimandzharoPeople + k2People + everestPeople;

        System.out.printf("%.2f%%\n", musalaPeople / totalPeople * 100.00);
        System.out.printf("%.2f%%\n", monblanPeople / totalPeople * 100.00);
        System.out.printf("%.2f%%\n", kilimandzharoPeople / totalPeople * 100.00);
        System.out.printf("%.2f%%\n", k2People / totalPeople * 100.00);
        System.out.printf("%.2f%%\n", everestPeople / totalPeople * 100.00);
    }
}

package Exam;

import java.util.Scanner;

public class ComputerCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerCount = Integer.parseInt(scanner.nextLine());

        double totalRating = 0;
        double totalSales = 0;

        for (int i = 0; i < computerCount; i++) {
            int code = Integer.parseInt(scanner.nextLine());

            int rating = code % 10;
            int sales = code / 10;

            totalRating += rating;

            if (rating == 3) {
                totalSales += sales * 0.5;
            } else if (rating == 4) {
                totalSales += sales * 0.7;
            } else if (rating == 5) {
                totalSales += sales * 0.85;
            } else if (rating == 6) {
                totalSales += sales;
            }
        }

        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", totalRating / computerCount);
    }
}

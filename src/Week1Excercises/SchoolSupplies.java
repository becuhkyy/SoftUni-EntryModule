package Week1Excercises;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        final double PENCIL_PRICE = 5.80;
        final double MARKER_PRICE = 7.20;
        final double CLEANING_SOLUTION_PRICE = 1.20;

        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litresCleaningSolution = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double discount = (double) discountPercent / 100;

        double total =
                (pencils * PENCIL_PRICE) +
                (markers * MARKER_PRICE) +
                (litresCleaningSolution * CLEANING_SOLUTION_PRICE);

        double totalDue = total - (total * discount);

        System.out.println(totalDue);
    }
}

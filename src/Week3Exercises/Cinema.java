package Week3Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (projectionType.equals("Premiere")) {
            income = rows * cols * 12.00;
        } else if (projectionType.equals("Normal")) {
            income = rows * cols * 7.50;
        } else if (projectionType.equals("Discount")) {
            income = rows * cols * 5.00;
        }

        System.out.printf("%.2f", income);

    }
}

package Week1Excercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        final double PROTECTIVE_COVER_PRICE = 1.50;
        final double PAINT_PRICE = 14.50;
        final double SOLVENT_PRICE = 5.00;

        Scanner scanner = new Scanner(System.in);

        int protectiveCover = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int solvent = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());
        final double bags = 0.40;

        double costOfMaterials =
                ((protectiveCover + 2) * PROTECTIVE_COVER_PRICE) +
                        (paint * 1.1 * PAINT_PRICE) +
                        (solvent * SOLVENT_PRICE) +
                        bags;

        double costOfWork = workingHours * (costOfMaterials * 0.3);

        double total = costOfMaterials + costOfWork;
        
        System.out.println(total);
    }
}

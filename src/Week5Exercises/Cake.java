package Week5Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeHeight = Integer.parseInt(scanner.nextLine());

        int remainingPieces = cakeHeight * cakeWidth;

        while (remainingPieces >= 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP"))
                break;

            remainingPieces -= Integer.parseInt(input);
        }

        if (remainingPieces >= 0) {
            System.out.printf("%d pieces are left.", remainingPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(remainingPieces));
        }
    }
}

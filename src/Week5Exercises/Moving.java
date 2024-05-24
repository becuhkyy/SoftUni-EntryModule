package Week5Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int availableSpace = width * length * height;


        while (availableSpace > 0) {
            String input = scanner.nextLine();

            if (input.equals("Done"))
                break;

            int boxes = Integer.parseInt(input);
            availableSpace -= boxes;
        }

        if (availableSpace > 0) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
        }
    }
}

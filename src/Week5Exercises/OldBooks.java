package Week5Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String targetBook = scanner.nextLine();

        int checked = 0;
        boolean found = false;

        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {

            if (input.equals(targetBook)) {
                found = true;
                break;
            }

            checked++;
            input = scanner.nextLine();
        }

        if (found)
            System.out.printf("You checked %d books and found it.", checked);
        else
            System.out.printf("The book you search is not here!\nYou checked %d books.", checked);
    }
}

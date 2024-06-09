package Week6Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.printf("%d ", current);
                if (current == n) {
                    isBigger = true;
                    break;
                }
                current++;
            }

            System.out.println();
            if (isBigger)
                break;

        }

    }
}

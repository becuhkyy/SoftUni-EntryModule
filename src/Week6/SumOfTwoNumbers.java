package Week6;

import java.util.Scanner;

import static java.lang.System.exit;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beg = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = beg; i <= end; i++) {
            for (int j = beg; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, i + j);
                    exit(0);
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}

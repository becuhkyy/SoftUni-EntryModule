package Week4;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += Integer.parseInt(scanner.nextLine());
        }

        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += Integer.parseInt(scanner.nextLine());
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }

    }
}

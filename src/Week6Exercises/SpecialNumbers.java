package Week6Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i < 10000; i++) {
            var number = "" + i;

            boolean isSpecial = true;

            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));

                if (digit == 0 || num % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial)
                System.out.printf("%s ", number);
        }
    }
}

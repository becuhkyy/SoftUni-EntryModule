package Week6Exercises;

import java.util.Scanner;

public class SumPrimeAndNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nonPrimeSum = 0;
        int primeSum = 0;

        String line = scanner.nextLine();

        while (!line.equals("stop")) {
            int number = Integer.parseInt(line);

            if (number < 0)
                System.out.println("Number is negative.");
            else {
                boolean isPrime = true;

                for (int i = 2; i <= number - 1; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += number;
                } else {
                    nonPrimeSum += number;
                }
            }
            line = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}

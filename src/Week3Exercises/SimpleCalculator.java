package Week3Exercises;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();


        switch (operator) {
            case "+":
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, n1 + n2, (n1 + n2) % 2 == 0 ? "even" : "odd");
                break;
            case "-":
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, n1 - n2, (n1 - n2) % 2 == 0 ? "even" : "odd");
                break;
            case "*":
                System.out.printf("%d %s %d = %d - %s", n1, operator, n2, n1 * n2, (n1 * n2) % 2 == 0 ? "even" : "odd");
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, (double) n1 / n2);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %s %d = %d", n1, operator, n2, n1 % n2);
                }
                break;
        }
    }
}

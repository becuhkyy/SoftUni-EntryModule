package Week6;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double cost = Double.parseDouble(scanner.nextLine());
            double saved = 0;

            while (saved < cost) {
                saved += Double.parseDouble(scanner.nextLine());
            }

            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}

package Exam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();


        switch (season) {
            case "spring":
                if (people > 5)
                    System.out.printf("%.2f leva.", people * 48.00);
                else
                    System.out.printf("%.2f leva.", people * 50.00);
                break;
            case "summer":
                if (people > 5)
                    System.out.printf("%.2f leva.", (people * 45.00) - (people * 45.00) * 0.15);
                else
                    System.out.printf("%.2f leva.", (people * 48.50) - (people * 48.50) * 0.15);
                break;
            case "autumn":
                if (people > 5)
                    System.out.printf("%.2f leva.", people * 49.50);
                else
                    System.out.printf("%.2f leva.", people * 60.00);
                break;
            case "winter":
                if (people > 5)
                    System.out.printf("%.2f leva.", (people * 85.00) + (people * 85.00) * 0.08);
                else
                    System.out.printf("%.2f leva.", (people * 86.00) + (people * 86.00) * 0.08);
                break;
        }

    }
}

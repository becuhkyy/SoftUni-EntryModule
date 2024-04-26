package Week2Exercises;

import java.util.Scanner;

public class AddMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes + 15 >= 60) {
            minutes = (minutes + 15) % 60;
            hours += 1;

            if (hours >= 24)
                hours = hours % 24;
        } else {
            minutes += 15;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}

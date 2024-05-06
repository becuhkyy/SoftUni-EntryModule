package Week3;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfTheWeek = scanner.nextLine();

        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            default:
                System.out.println(16);
        }
    }
}

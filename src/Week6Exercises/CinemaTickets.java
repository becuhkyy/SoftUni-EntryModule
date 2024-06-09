package Week6Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        double studentTickets = 0;
        double standardTickets = 0;
        double kidsTickets = 0;
        int totalTickets = 0;

        while (!movieName.equals("Finish")) {

            int seats = Integer.parseInt(scanner.nextLine());
            double seatsTaken = 0;

            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "standard":
                        standardTickets++;
                        seatsTaken++;
                        break;
                    case "student":
                        studentTickets++;
                        seatsTaken++;
                        break;
                    case "kid":
                        kidsTickets++;
                        seatsTaken++;
                        break;
                }

                if (seatsTaken == seats)
                    break;

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, seatsTaken / seats * 100.0);

            movieName = scanner.nextLine();
        }

        totalTickets = (int) (studentTickets + standardTickets + kidsTickets);
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets / totalTickets * 100.00);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets / totalTickets * 100.00);
        System.out.printf("%.2f%% kids tickets.%n", kidsTickets / totalTickets * 100.00);

    }
}

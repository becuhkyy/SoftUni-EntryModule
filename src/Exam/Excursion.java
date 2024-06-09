package Exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());

        int stays = Integer.parseInt(scanner.nextLine());
        int transportationTickets = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        double totalPerPerson = stays * 20 + transportationTickets * 1.6 + museumTickets * 6;
        double groupTotal = groupSize * totalPerPerson;
        groupTotal += groupTotal * 0.25;

        System.out.printf("%.2f", groupTotal);
    }
}

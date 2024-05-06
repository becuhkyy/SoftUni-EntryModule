package Week3Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50 * nights;
                apartmentPrice = 65 * nights;

                if (nights > 7 & nights <= 14)
                    studioPrice *= 0.95;
                else if (nights > 14) {
                    apartmentPrice *= 0.9;
                    studioPrice *= 0.7;
                }

                break;
            case "June":
            case "September":
                studioPrice = 75.20 * nights;
                apartmentPrice = 68.7 * nights;

                if (nights > 14) {
                    apartmentPrice *= 0.9;
                    studioPrice *= 0.8;
                }

                break;
            case "July":
            case "August":
                studioPrice = 76.0 * nights;
                apartmentPrice = 77 * nights;

                if (nights > 14) {
                    apartmentPrice *= 0.9;
                }
                break;
        }


        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}

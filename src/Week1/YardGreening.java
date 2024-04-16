package Week1;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        double pricePerSqm = 7.61;
        double discountPercent = 0.18;

        Scanner scanner = new Scanner(System.in);
        double yardArea = Double.parseDouble(scanner.nextLine());

        double regularPrice = yardArea * pricePerSqm;
        double discount = regularPrice * discountPercent;
        double discountedPrice = regularPrice - discount;

        System.out.printf("The final price is: %.2f lv.", discountedPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}

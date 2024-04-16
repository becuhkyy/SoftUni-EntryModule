package Week1Excercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double shoes = yearlyTax - yearlyTax * 0.4;
        double jersey = shoes - shoes * 0.2;
        double basketball = jersey / 4;
        double accessories = basketball / 5;

        double total = yearlyTax + shoes + jersey + basketball + accessories;

        System.out.println(total);
    }
}

package Week3;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        if (city.equals("Sofia")) {
            if (item.equals("coffee"))
                System.out.println(quantity * 0.5);
            else if (item.equals("water"))
                System.out.println(quantity * 0.8);
            else if (item.equals("beer"))
                System.out.println(quantity * 1.2);
            else if (item.equals("sweets"))
                System.out.println(quantity * 1.45);
            else if (item.equals("peanuts"))
                System.out.println(quantity * 1.6);
        } else if (city.equals("Plovdiv")) {
            if (item.equals("coffee"))
                System.out.println(quantity * 0.4);
            else if (item.equals("water"))
                System.out.println(quantity * 0.7);
            else if (item.equals("beer"))
                System.out.println(quantity * 1.15);
            else if (item.equals("sweets"))
                System.out.println(quantity * 1.30);
            else if (item.equals("peanuts"))
                System.out.println(quantity * 1.5);
        } else if (city.equals("Varna")) {
            if (item.equals("coffee"))
                System.out.println(quantity * 0.45);
            else if (item.equals("water"))
                System.out.println(quantity * 0.7);
            else if (item.equals("beer"))
                System.out.println(quantity * 1.1);
            else if (item.equals("sweets"))
                System.out.println(quantity * 1.35);
            else if (item.equals("peanuts"))
                System.out.println(quantity * 1.55);
        }


    }
}

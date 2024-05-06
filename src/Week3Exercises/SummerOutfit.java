package Week3Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempDegrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String outfit = "";
        String shoes = "";


        switch (dayTime) {
            case "Morning": {
                if (tempDegrees >= 10 && tempDegrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (tempDegrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (tempDegrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            }
            case "Afternoon": {
                if (tempDegrees >= 10 && tempDegrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (tempDegrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (tempDegrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            }
            case "Evening": {
                outfit = "Shirt";
                shoes = "Moccasins";
                break;
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", tempDegrees, outfit, shoes);
    }
}

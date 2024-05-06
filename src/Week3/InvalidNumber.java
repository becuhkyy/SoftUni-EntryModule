package Week3;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theNumber = Integer.parseInt(scanner.nextLine());

        boolean isValid = theNumber == 0 || (theNumber >= 100 && theNumber <= 200);
        
        if (!isValid)
            System.out.println("invalid");
    }
}

package Week1;

import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        double inch = 2.54;
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println(a * inch);
    }
}

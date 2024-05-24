package Week5;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String correctPassword = scanner.nextLine();

        String password = scanner.nextLine();

        while (!password.equals(correctPassword)) {
            password = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}

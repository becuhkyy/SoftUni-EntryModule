package Week2;

import java.util.Scanner;

public class GuessThePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CORRECT_PASS = "s3cr3t!P@ssw0rd";

        String pass = scanner.nextLine();

        if (pass.equals(CORRECT_PASS))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
    }
}

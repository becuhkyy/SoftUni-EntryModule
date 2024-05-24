package Week4Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double weight = 100.00 / n;
        double p1 = 0.00, p2 = 0.00, p3 = 0.00, p4 = 0.00, p5 = 0.00;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number < 200)
                p1 += weight;
            else if (number < 400)
                p2 += weight;
            else if (number < 600)
                p3 += weight;
            else if (number < 800)
                p4 += weight;
            else
                p5 += weight;
        }

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);
    }
}

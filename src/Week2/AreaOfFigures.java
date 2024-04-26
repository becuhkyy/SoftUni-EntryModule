package Week2;


import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println(a * a);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.PI * Math.pow(r, 2));
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            System.out.println((a * ha) / 2);
        }
    }
}
